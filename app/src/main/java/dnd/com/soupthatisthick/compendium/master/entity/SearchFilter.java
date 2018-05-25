package dnd.com.soupthatisthick.compendium.master.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;


/**
 * Created by Owner on 5/4/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
@Entity(tableName = "DAO_SEARCHABLE")
public class SearchFilter {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private Long id = null;

    @ColumnInfo(name = "table")
    private String table = null;

    @ColumnInfo(name = "column")
    private String column = null;

    // This is not a property stored in the databaseand is only used in code.
    private boolean allowed = true;

    @Ignore
    public SearchFilter(Long id, String table, String column, boolean allowed) {
        this.id = id;
        this.table = table;
        this.column = column;
        this.allowed = allowed;
    }

    public SearchFilter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    @Override
    public String toString()
    {
        return getTable() + "." + getColumn();
    }

    public boolean isAllowed() {
        return allowed;
    }

    public void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }

    public boolean getAllowed() {
        return this.allowed;
    }
}
