package dnd.com.soupthatisthick.compendium.common.ifaces;

import android.arch.persistence.room.RoomDatabase;

public interface AbstractDao<Key, Record> {
    RoomDatabase getDatabase();
    String getTableName();
}
