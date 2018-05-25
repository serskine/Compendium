package dnd.com.soupthatisthick.compendium.master.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Owner on 5/5/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
@Entity(tableName = "LEVEL_DETAILS")
public class Level {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private Long id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "xp")
    private Integer xp;

    @ColumnInfo(name = "level")
    private Integer level;

    @ColumnInfo(name = "proficiency")
    private Integer proficiency;

    @ColumnInfo(name = "tier")
    private Integer tier;

    @ColumnInfo(name = "easy")
    private Integer easy;

    @ColumnInfo(name = "normal")
    private Integer normal;

    @ColumnInfo(name = "hard")
    private Integer hard;

    @ColumnInfo(name = "deadly")
    private Integer deadly;

    @Ignore
    public Level(Long id, String name, Integer xp, Integer level,
                 Integer proficiency, Integer tier, Integer easy, Integer normal,
                 Integer hard, Integer deadly) {
        this.id = id;
        this.name = name;
        this.xp = xp;
        this.level = level;
        this.proficiency = proficiency;
        this.tier = tier;
        this.easy = easy;
        this.normal = normal;
        this.hard = hard;
        this.deadly = deadly;
    }

    public Level() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getProficiency() {
        return proficiency;
    }

    public void setProficiency(Integer proficiency) {
        this.proficiency = proficiency;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public Integer getEasy() {
        return easy;
    }

    public void setEasy(Integer easy) {
        this.easy = easy;
    }

    public Integer getNormal() {
        return normal;
    }

    public void setNormal(Integer normal) {
        this.normal = normal;
    }

    public Integer getHard() {
        return hard;
    }

    public void setHard(Integer hard) {
        this.hard = hard;
    }

    public Integer getDeadly() {
        return deadly;
    }

    public void setDeadly(Integer deadly) {
        this.deadly = deadly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return String.format("%s (%d xp)", getName(), getXp());
    }
}
