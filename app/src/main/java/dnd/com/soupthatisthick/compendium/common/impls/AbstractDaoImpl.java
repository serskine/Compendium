package dnd.com.soupthatisthick.compendium.common.impls;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.RoomDatabase;

import dnd.com.soupthatisthick.compendium.common.ifaces.AbstractDao;

@Dao
public class AbstractDaoImpl<Key, Record> implements AbstractDao<Key, Record> {

    protected final RoomDatabase database;
    protected final String tableName;

    @Override
    public RoomDatabase getDatabase() {
        return this.database;
    }

    @Override
    public String getTableName() {
        return this.tableName;
    }

    public AbstractDaoImpl(RoomDatabase roomDatabase, String tableName) {
        this.database = roomDatabase;
        this.tableName = tableName;
    }

    public final String getDaoName() {
        return database.getOpenHelper().getDatabaseName() + "." + getTableName();
    }
}
