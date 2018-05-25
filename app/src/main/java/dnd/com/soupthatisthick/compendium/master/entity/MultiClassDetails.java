package dnd.com.soupthatisthick.compendium.master.entity;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Owner on 5/5/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

@Entity(tableName="MULTICLASSING")
public class MultiClassDetails {

    @PrimaryKey
    @ColumnInfo(name="id")
    private Long id;

    @ColumnInfo(name="prerequisite")
    private String prerequisite;

    @ColumnInfo(name="proficiencies")
    private String proficiencies;

    @ColumnInfo(name="class")
    private String className;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    public String getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(String proficiencies) {
        this.proficiencies = proficiencies;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
