package dnd.com.soupthatisthick.compendium.master.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;


/**
 * Created by Owner on 4/18/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
@Entity(tableName = "LIST_ITEMS")
public class ItemOfList {

    @PrimaryKey
    @ColumnInfo(name = "itemId")
    private Long itemId;

    @ColumnInfo(name = "listId")
    private Long listId;

    @ColumnInfo(name = "metaData")
    private String metaData;

    @ColumnInfo(name = "table")
    private String table;

    @ColumnInfo(name = "primaryKey")
    private String primaryKey;

    @ColumnInfo(name = "key")
    private Long key;

    @Ignore
    public ItemOfList(Long itemId, Long listId, String metaData, String table, String primaryKey, Long key) {
        this.itemId = itemId;
        this.listId = listId;
        this.metaData = metaData;
        this.table = table;
        this.primaryKey = primaryKey;
        this.key = key;
    }

    public ItemOfList() {
    }

    public Long getId() {
        return getItemId();
    }

    /**
     * @return a unique identifier for an item in a list.
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This will set the unique id for this items. All items should have different id's no matter what
     * list they are contained within.
     * @param itemId
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the id of the list that this item belongs to
     */
    public Long getListId() {
        return listId;
    }

    /**
     * This will indicate which list this list item belongs to
     * @param listId
     */
    public void setListId(Long listId) {
        this.listId = listId;
    }

    /**
     * This will return all the text that describes this list item in addition to the item itself
     * @return
     */
    public String getMetaData() {
        return metaData;
    }

    /**
     * This is a column that will be included for search queries. It is not intended to be visible to the user
     * except by editing
     * @param metaData
     */
    public void setMetaData(String metaData) {
        this.metaData = metaData;
    }

    /**
     * @return the name of the database table that will contain the item
     */
    public String getTable() {
        return table;
    }

    /**
     * This will determine what database table we access
     * @param table is the name of the table in the database (or DaoMaster)
     */
    public void setTable(String table) {
        this.table = table;
    }

    /**
     * @return the name of the database column for the primary key used to select the item from
     */
    public String getPrimaryKey() {
        return primaryKey;
    }

    /**
     * This determines what table the item is contained in
     * @param primaryKey
     */
    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    /**
     * @return the id in the database table this is contained in
     */
    public Long getKey() {
        return key;
    }

    /**
     * Sets the key to reference the item from the database with using a limit 1 select query on the primary key column.
     * @param key
     */
    public void setKey(Long key) {
        this.key = key;
    }

}
