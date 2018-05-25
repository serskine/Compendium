package dnd.com.soupthatisthick.compendium;

import android.app.Activity;
import android.arch.persistence.room.RoomDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.impls.BackgroundTask;
import dnd.com.soupthatisthick.compendium.common.impls.Logger;
import dnd.com.soupthatisthick.compendium.common.impls.json.JsonUtil;
import dnd.com.soupthatisthick.compendium.master.dao.WeaponDao;
import dnd.com.soupthatisthick.compendium.master.dbase.MasterDatabase;
import dnd.com.soupthatisthick.compendium.master.entity.Weapon;

public class MainActivity extends Activity {

    private TextView outputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputTextView = findViewById(R.id.outputTextView);
    }

    public void onResume() {
        super.onResume();
        new BackgroundTask() {
            @Override
            public void doIt() {
                    MasterDatabase db = MasterDatabase.getInstance(getApplicationContext(), true);
                    WeaponDao weaponDao = db.weaponDao();
                    List<Weapon> weapons = weaponDao.findAll();

                    final String outputText = JsonUtil.toJson(weapons, true);
                    Log.d(this.getClass().getSimpleName(), outputText);

                    outputTextView.setText(outputText);
            }
        }.execute();
    }
}
