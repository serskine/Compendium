package dnd.com.soupthatisthick.compendium.common.impls;

import android.arch.persistence.room.RoomDatabase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dnd.com.soupthatisthick.compendium.common.ifaces.ReadDao;

public class ReadDaoImpl<Key, Record> extends AbstractDaoImpl<Key, Record> implements ReadDao<Key, Record> {
    public ReadDaoImpl(final RoomDatabase roomDatabase, final String tableName) {
        super(roomDatabase, tableName);
    }

    @Override
    public Record load(Key key) {
        throw new RuntimeException("load(Key) is not yet supported on table " + this.getDaoName() + " (" + this.getClass().getSimpleName() + ")");
    }

    @Override
    public List<Record> searchFor(String[] includedTerms, String[] excludedTerms) {
        throw new RuntimeException("searchFor(includedTerms[], excludedTerms[]) is not yet supported on table " + this.getDaoName() + " (" + this.getClass().getSimpleName() + ")");
    }

    @Override
    public List<Record> findAll() {
        throw new RuntimeException("findAll() is not yet supported on table " + this.getDaoName() + " (" + this.getClass().getSimpleName() + ")");
    }

    @Override
    public Set<String> getSearchableColumns() {
        throw new RuntimeException("getSearchableColumns() is not yet supported on table " + this.getDaoName() + " (" + this.getClass().getSimpleName() + ")");
    }

    @Override
    public List<String> getOrderByColumns() {
        throw new RuntimeException("getOrderByColumns() is not yet supported on table " + this.getDaoName() + " (" + this.getClass().getSimpleName() + ")");
    }
}
