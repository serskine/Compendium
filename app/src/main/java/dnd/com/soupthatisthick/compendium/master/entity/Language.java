package dnd.com.soupthatisthick.compendium.master.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Owner on 5/5/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

@Entity(tableName="LANGUAGES")
public class Language {

    @PrimaryKey
    @ColumnInfo(name="id")
    private Long id;

    @ColumnInfo(name="name")
    private String name;

    @ColumnInfo(name="speakers")
    private String speakers;

    @ColumnInfo(name="script")
    private String script;

    @ColumnInfo(name="type")
    private String type;

    @ColumnInfo(name="description")
    private String description;

    public Language() {}

    @Ignore()
    public Language(Long id, String name, String speakers, String script, String description) {
        this.id = id;
        this.name = name;
        this.speakers = speakers;
        this.script = script;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeakers() {
        return speakers;
    }

    public void setSpeakers(String speakers) {
        this.speakers = speakers;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
