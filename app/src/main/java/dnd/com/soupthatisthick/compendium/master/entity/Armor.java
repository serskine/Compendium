package dnd.com.soupthatisthick.compendium.master.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Owner on 5/5/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
@Entity(tableName = "ARMOR")
public class Armor {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private Long id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "cost")
    private String cost;

    @ColumnInfo(name = "ac")
    private String ac;

    @ColumnInfo(name = "strength")
    private String strengthRequirement;

    @ColumnInfo(name = "stealth")
    private String stealthEffect;

    @ColumnInfo(name = "weight")
    private String weight;

    @ColumnInfo(name = "type")
    private String type;

    @ColumnInfo(name = "description")
    private String description;

    @Ignore
    public Armor(Long id, String name, String cost, String ac,
                 String strengthRequirement, String stealthEffect, String weight,
                 String type, String description) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.ac = ac;
        this.strengthRequirement = strengthRequirement;
        this.stealthEffect = stealthEffect;
        this.weight = weight;
        this.type = type;
        this.description = description;
    }

    public Armor() {
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

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getStrengthRequirement() {
        return strengthRequirement;
    }

    public void setStrengthRequirement(String strengthRequirement) {
        this.strengthRequirement = strengthRequirement;
    }

    public String getStealthEffect() {
        return stealthEffect;
    }

    public void setStealthEffect(String stealthRequirement) {
        this.stealthEffect = stealthRequirement;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
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
