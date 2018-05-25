package dnd.com.soupthatisthick.compendium.master.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.Nullable;

/**
 * Created by Owner on 1/26/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
@Entity(tableName = "CUSTOM_MONSTERS")
public class CustomMonster {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private Long id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "type")
    private String type;

    @ColumnInfo(name = "alignment")
    private String alignment;

    @ColumnInfo(name = "ac")
    private int ac;

    @ColumnInfo(name = "acType")
    private String acType;

    @ColumnInfo(name = "hp")
    private String hp;

    @ColumnInfo(name = "hd")
    private String hd;

    @ColumnInfo(name = "speed")
    private String speed;

    @ColumnInfo(name = "str")
    private int strength;

    @ColumnInfo(name = "dex")
    private int dexterity;

    @ColumnInfo(name = "con")
    private int constitution;

    @ColumnInfo(name = "int")
    private int intelligence;

    @ColumnInfo(name = "wis")
    private int wisdom;

    @ColumnInfo(name = "cha")
    private int charisma;

    @ColumnInfo(name = "saves")
    private String saves;

    @ColumnInfo(name = "skills")
    private String skills;

    @ColumnInfo(name = "dmgResistance")
    private String dmgResistance;

    @ColumnInfo(name = "dmgImmunity")
    private String dmgImmunity;

    @ColumnInfo(name = "conditionImmunity")
    private String conditionImmunity;

    @ColumnInfo(name = "senses")
    private String senses;

    @ColumnInfo(name = "languages")
    private String languages;

    @ColumnInfo(name = "cr")
    private String cr;

    @ColumnInfo(name = "xp")
    private int xp;

    @ColumnInfo(name = "abilities")
    private String abilities;

    @ColumnInfo(name = "actions")
    private String actions;

    @ColumnInfo(name = "legendary")
    private String legendaryActions;

    @ColumnInfo(name = "other")
    private String other;

    @ColumnInfo(name = "source")
    private String source;


    @Ignore
    public CustomMonster(Long id, String name, String type, String alignment,
                         int ac, String acType, String hp, String hd, String speed, int strength,
                         int dexterity, int constitution, int intelligence, int wisdom,
                         int charisma, String saves, String skills, String dmgResistance,
                         String dmgImmunity, String conditionImmunity, String senses,
                         String languages, String cr, int xp, String abilities, String actions,
                         String legendaryActions, String other, String source) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.alignment = alignment;
        this.ac = ac;
        this.acType = acType;
        this.hp = hp;
        this.hd = hd;
        this.speed = speed;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.saves = saves;
        this.skills = skills;
        this.dmgResistance = dmgResistance;
        this.dmgImmunity = dmgImmunity;
        this.conditionImmunity = conditionImmunity;
        this.senses = senses;
        this.languages = languages;
        this.cr = cr;
        this.xp = xp;
        this.abilities = abilities;
        this.actions = actions;
        this.legendaryActions = legendaryActions;
        this.other = other;
        this.source = source;
    }

    public CustomMonster() {
    }


    public Long getId() {
        return id;
    }

    public void setId(@Nullable Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public String getAcType() {
        return acType;
    }

    public void setAcType(String acType) {
        this.acType = acType;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public String getSaves() {
        return saves;
    }

    public void setSaves(String saves) {
        this.saves = saves;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getDmgResistance() {
        return dmgResistance;
    }

    public void setDmgResistance(String dmgResistance) {
        this.dmgResistance = dmgResistance;
    }

    public String getDmgImmunity() {
        return dmgImmunity;
    }

    public void setDmgImmunity(String dmgImmunity) {
        this.dmgImmunity = dmgImmunity;
    }

    public String getConditionImmunity() {
        return conditionImmunity;
    }

    public void setConditionImmunity(String conditionImmunity) {
        this.conditionImmunity = conditionImmunity;
    }

    public String getSenses() {
        return senses;
    }

    public void setSenses(String senses) {
        this.senses = senses;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public String getLegendaryActions() {
        return legendaryActions;
    }

    public void setLegendaryActions(String legendaryActions) {
        this.legendaryActions = legendaryActions;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString()
    {
        return String.format("%s (%s %d xp)", getName(), getCr(), getXp());
    }
}
