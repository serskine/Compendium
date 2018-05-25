package dnd.com.soupthatisthick.compendium.master.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Owner on 5/1/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

@Entity(tableName = "CONTACTS")
public class Contact {

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "dci")
    private String dci;

    @PrimaryKey
    @ColumnInfo(name = "id")
    private Long id;

    @Ignore
    public Contact(String name, String dci, Long id) {
        this.name = name;
        this.dci = dci;
        this.id = id;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDci() {
        return dci;
    }

    public void setDci(String dci) {
        this.dci = dci;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
