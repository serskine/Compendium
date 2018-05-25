package dnd.com.soupthatisthick.compendium.master.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;


/**
 * Created by Owner on 4/18/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
@Entity(tableName = "LISTS")
public class ItemList {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private Long id;

    @ColumnInfo(name = "name")
    private String name;

    @Ignore
    public ItemList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ItemList() {
    }

    /**
     * This returns the unique identifier for the specified list
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * This sets the id of the specific list
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This will return the name of the list used for display purposes
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * This will set the name of the list used for display purposes.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
