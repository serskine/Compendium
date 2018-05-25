package dnd.com.soupthatisthick.compendium.common.ifaces;

public interface WriteDao<Key, Record> extends ReadDao<Key, Record>, Crud<Key, Record> {
}
