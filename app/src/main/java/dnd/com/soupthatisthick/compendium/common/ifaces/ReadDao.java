package dnd.com.soupthatisthick.compendium.common.ifaces;

import java.util.List;
import java.util.Set;

public interface ReadDao<Key, Record> extends AbstractDao<Key, Record> {

    Record load(Key key);
    List<Record> searchFor(String[] includedTerms, String[] excludedTerms);
    List<Record> findAll();


    Set<String> getSearchableColumns();
    List<String> getOrderByColumns();
}
