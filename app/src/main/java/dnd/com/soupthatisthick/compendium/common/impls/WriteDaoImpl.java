package dnd.com.soupthatisthick.compendium.common.impls;

import android.arch.persistence.room.RoomDatabase;
import android.support.annotation.NonNull;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;

public class WriteDaoImpl<Key, Record> extends ReadDaoImpl<Key, Record> implements WriteDao<Key, Record> {
    public WriteDaoImpl(RoomDatabase roomDatabase, String tableName) {
        super(roomDatabase, tableName);
    }

    @Override
    public Record create() {
        throw new RuntimeException("create() is not yet supported on table " + this.getDaoName() + " (" + this.getClass().getSimpleName() + ")");
    }

    @Override
    public boolean update(@NonNull Key key, @NonNull Record record) {
        throw new RuntimeException("update(Key, Record) is not yet supported on table " + this.getDaoName() + " (" + this.getClass().getSimpleName() + ")");
    }

    @Override
    public boolean delete(@NonNull Key key) {
        throw new RuntimeException("delete(Key) is not yet supported on table " + this.getDaoName() + " (" + this.getClass().getSimpleName() + ")");
    }

    @Override
    public void clear() {
        throw new RuntimeException("clear() is not yet supported on table " + this.getDaoName() + " (" + this.getClass().getSimpleName() + ")");
    }
}
