package dnd.com.soupthatisthick.compendium.master.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Owner on 5/8/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

@Entity(tableName = "CR_DETAILS")
public class ChallengeRating {
    @PrimaryKey
    @ColumnInfo(name = "id")
    private Long id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "value")
    private Double value;

    @ColumnInfo(name = "prof")
    private Integer proficiency;

    @ColumnInfo(name = "maxAc")
    private Integer maxAc;

    @ColumnInfo(name = "minHp")
    private Integer minHp;

    @ColumnInfo(name = "maxHp")
    private Integer maxHp;

    @ColumnInfo(name = "minDmg")
    private Integer minDmg;

    @ColumnInfo(name = "maxDmg")
    private Integer maxDmg;

    @ColumnInfo(name = "saveDc")
    private Integer saveDc;

    @ColumnInfo(name = "xp")
    private Integer xp;


    @Ignore
    public ChallengeRating(Long id, String name, Double value, Integer proficiency,
                           Integer maxAc, Integer minHp, Integer maxHp, Integer minDmg,
                           Integer maxDmg, Integer saveDc, Integer xp) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.proficiency = proficiency;
        this.maxAc = maxAc;
        this.minHp = minHp;
        this.maxHp = maxHp;
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.saveDc = saveDc;
        this.xp = xp;
    }

    public ChallengeRating() {
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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getProficiency() {
        return proficiency;
    }

    public void setProficiency(Integer proficiency) {
        this.proficiency = proficiency;
    }

    public Integer getMaxAc() {
        return maxAc;
    }

    public void setMaxAc(Integer maxAc) {
        this.maxAc = maxAc;
    }

    public Integer getMinHp() {
        return minHp;
    }

    public void setMinHp(Integer minHp) {
        this.minHp = minHp;
    }

    public Integer getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(Integer maxHp) {
        this.maxHp = maxHp;
    }

    public Integer getMinDmg() {
        return minDmg;
    }

    public void setMinDmg(Integer minDmg) {
        this.minDmg = minDmg;
    }

    public Integer getMaxDmg() {
        return maxDmg;
    }

    public void setMaxDmg(Integer maxDmg) {
        this.maxDmg = maxDmg;
    }

    public Integer getSaveDc() {
        return saveDc;
    }

    public void setSaveDc(Integer saveDc) {
        this.saveDc = saveDc;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    @Override
    public String toString()
    {
        return String.format("%s (%d xp)", getName(), getXp());
    }
}
