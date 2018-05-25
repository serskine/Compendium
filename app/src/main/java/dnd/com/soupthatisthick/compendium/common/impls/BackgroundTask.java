package dnd.com.soupthatisthick.compendium.common.impls;

import android.arch.persistence.room.PrimaryKey;
import android.os.AsyncTask;
import android.util.Log;

public abstract class BackgroundTask extends AsyncTask<Void, Void, Exception> {
    @Override
    protected final Exception doInBackground(Void... voids) {
        try {
            return null;
        } catch (Exception e) {
            Log.e("Background task", e.getMessage(), e);
            return e;
        }
    }

    public abstract void doIt();
}
