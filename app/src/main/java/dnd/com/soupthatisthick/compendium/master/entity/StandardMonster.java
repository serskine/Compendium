package dnd.com.soupthatisthick.compendium.master.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.Nullable;

/**
 * Created by Owner on 3/13/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
@Entity(tableName = "STANDARD_MONSTERS")
public class StandardMonster {

    //
    // The variables
    //
	@PrimaryKey
	@ColumnInfo(name = "id")
    private Long id;


	@ColumnInfo(name = "name")
	private String name;

	@ColumnInfo(name = "size")
	private String size;

	@ColumnInfo(name = "type")
	private String type;

	@ColumnInfo(name = "subtype")
	private String subType;

	@ColumnInfo(name = "alignment")
	private String alignment;

	@ColumnInfo(name = "armor_class")
	private String armorClass;

	@ColumnInfo(name = "hit_points")
	private String hitPoints;

	@ColumnInfo(name = "hit_dice")
	private String hitDice;

	@ColumnInfo(name = "speed")
	private String speed;


	@ColumnInfo(name = "strength")
	private int strength;

	@ColumnInfo(name = "dexterity")
	private int dexterity;

	@ColumnInfo(name = "constitution")
	private int constitution;

	@ColumnInfo(name = "intelligence")
	private int intelligence;

	@ColumnInfo(name = "wisdom")
	private int wisdom;

	@ColumnInfo(name = "charisma")
	private int charisma;


	@ColumnInfo(name = "strength_save")
	private Integer strengthSave;

	@ColumnInfo(name = "dexterity_save")
	private Integer dexteritySave;

	@ColumnInfo(name = "constitution_save")
	private Integer constitutionSave;

	@ColumnInfo(name = "intelligence_save")
	private Integer intelligenceSave;

	@ColumnInfo(name = "wisdom_save")
	private Integer wisdomSave;

	@ColumnInfo(name = "charisma_save")
	private Integer charismaSave;


	@ColumnInfo(name = "acrobatics")
	private Integer acrobatics;

	@ColumnInfo(name = "arcana")
	private Integer arcana;

	@ColumnInfo(name = "athletics")
	private Integer athletics;

	@ColumnInfo(name = "deception")
	private Integer deception;

	@ColumnInfo(name = "history")
	private Integer history;

	@ColumnInfo(name = "insight")
	private Integer insight;

	@ColumnInfo(name = "investigation")
	private Integer investigation;

	@ColumnInfo(name = "intimidation")
	private Integer intimidation;

	@ColumnInfo(name = "medicine")
	private Integer medicine;

	@ColumnInfo(name = "nature")
	private Integer nature;

	@ColumnInfo(name = "perception")
	private Integer perception;

	@ColumnInfo(name = "performance")
	private Integer performance;

	@ColumnInfo(name = "persuasion")
	private Integer persuasion;

	@ColumnInfo(name = "religion")
	private Integer religion;

	@ColumnInfo(name = "stealth")
	private Integer stealth;

	@ColumnInfo(name = "survival")
	private Integer survival;


	@ColumnInfo(name = "damage_vulnerabilities")
	private String damageVulnerabilities;

	@ColumnInfo(name = "damage_resistances")
	private String damageResistances;

	@ColumnInfo(name = "damage_immunities")
	private String damageImmunities;

	@ColumnInfo(name = "condition_immunities")
	private String conditionImmunities;


	@ColumnInfo(name = "senses")
	private String senses;

	@ColumnInfo(name = "languages")
	private String languages;

	@ColumnInfo(name = "challenge_rating")
	private String challengeRating;


	@ColumnInfo(name = "special_abilities")
	private String specialAbilities;

	@ColumnInfo(name = "actions")
	private String actions;

	@ColumnInfo(name = "legendary_actions")
	private String legendaryActions;

	@ColumnInfo(name = "reactions")
	private String reactions;


	@ColumnInfo(name = "source")
	private String source;

	@Ignore
	public StandardMonster(Long id, String name, String size, String type,
                           String subType, String alignment, String armorClass, String hitPoints,
                           String hitDice, String speed, Integer strength, Integer dexterity, Integer constitution,
                           Integer intelligence, Integer wisdom, Integer charisma, Integer strengthSave,
                           Integer dexteritySave, Integer constitutionSave, Integer intelligenceSave, Integer wisdomSave,
                           Integer charismaSave, Integer acrobatics, Integer arcana, Integer athletics, Integer deception,
                           Integer history, Integer insight, Integer investigation, Integer intimidation, Integer medicine,
                           Integer nature, Integer perception, Integer performance, Integer persuasion, Integer religion,
                           Integer stealth, Integer survival, String damageVulnerabilities,
                           String damageResistances, String damageImmunities, String conditionImmunities,
                           String senses, String languages, String challengeRating,
                           String specialAbilities, String actions, String legendaryActions,
                           String reactions, String source) {
		this.id = id;
		this.name = name;
		this.size = size;
		this.type = type;
		this.subType = subType;
		this.alignment = alignment;
		this.armorClass = armorClass;
		this.hitPoints = hitPoints;
		this.hitDice = hitDice;
		this.speed = speed;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
		this.strengthSave = strengthSave;
		this.dexteritySave = dexteritySave;
		this.constitutionSave = constitutionSave;
		this.intelligenceSave = intelligenceSave;
		this.wisdomSave = wisdomSave;
		this.charismaSave = charismaSave;
		this.acrobatics = acrobatics;
		this.arcana = arcana;
		this.athletics = athletics;
		this.deception = deception;
		this.history = history;
		this.insight = insight;
		this.investigation = investigation;
		this.intimidation = intimidation;
		this.medicine = medicine;
		this.nature = nature;
		this.perception = perception;
		this.performance = performance;
		this.persuasion = persuasion;
		this.religion = religion;
		this.stealth = stealth;
		this.survival = survival;
		this.damageVulnerabilities = damageVulnerabilities;
		this.damageResistances = damageResistances;
		this.damageImmunities = damageImmunities;
		this.conditionImmunities = conditionImmunities;
		this.senses = senses;
		this.languages = languages;
		this.challengeRating = challengeRating;
		this.specialAbilities = specialAbilities;
		this.actions = actions;
		this.legendaryActions = legendaryActions;
		this.reactions = reactions;
		this.source = source;
	}

	public StandardMonster() {
	}

    //
    // The getters
    //


    public Long getId() {
		return this.id;
	}

    public String getName() {
		return this.name;
	}
    public String getSize() {
		return this.size;
	}
    public String getType() {
		return this.type;
	}
    public String getSubType() {
		return this.subType;
	}
    public String getAlignment() {
		return this.alignment;
	}
    public String getArmorClass() {
		return this.armorClass;
	}
    public String getHitPoints() {
		return this.hitPoints;
	}
    public String getHitDice() {
		return this.hitDice;
	}
    public String getSpeed() {
		return this.speed;
	}

	public int getStrength() {
		return this.strength;
	}

	/**
	 * This will return the provided stat unless it is null. Then it will provide the provided ability modifier
	 * @param skillOrSave
	 * @param modifier
	 * @return
	 */
	private static final int getBonus(@Nullable Integer skillOrSave, int modifier) {
		if (skillOrSave==null) {
			return modifier;
		} else {
			return skillOrSave.intValue();
		}
	}

	public int getStrengthSave() {
		return getBonus(this.strengthSave, getStrengthMod());
	}
	public int getDexteritySave() {
		return getBonus(this.dexteritySave, getDexterityMod());
	}
	public int getConstitutionSave() {
		return getBonus(this.constitutionSave, getConstitutionMod());
	}
    public int getIntelligenceSave() { return getBonus(this.intelligenceSave, getIntelligenceMod()); }
    public int getWisdomSave() {
		return getBonus(this.wisdomSave, getWisdomMod());
	}
	public int getCharismaSave() {
		return getBonus(this.charismaSave, getCharismaMod());
	}

    public int getHistory() {
		return getBonus(this.history, getIntelligenceMod());
	}
    public int getPerception() {
		return getBonus(this.perception, getWisdomMod());
	}
	public int getMedicine() {
		return getBonus(this.medicine, getWisdomMod());
	}
	public int getReligion() {
		return getBonus(this.religion, getIntelligenceMod());
	}
	public int getStealth() {
		return getBonus(this.stealth, getDexterityMod());
	}
	public int getPersuasion() {
		return getBonus(this.persuasion, getCharismaMod());
	}
	public int getInsight() {
		return getBonus(this.insight, getWisdomMod());
	}
	public int getDeception() {
		return getBonus(this.deception, getCharismaMod());
	}
	public int getArcana() {
		return getBonus(this.arcana, getIntelligenceMod());
	}
	public int getAthletics() {
		return getBonus(this.athletics, getStrengthMod());
	}
	public int getAcrobatics() {
		return getBonus(this.acrobatics, getDexterityMod());
	}
	public int getSurvival() {
		return getBonus(this.survival, getWisdomMod());
	}
	public int getInvestigation() {
		return getBonus(this.investigation, getIntelligenceMod());
	}
	public int getNature() {
		return getBonus(this.nature, getIntelligenceMod());
	}
	public int getIntimidation() {
		return getBonus(this.intimidation, getCharismaMod());
	}
	public int getPerformance() {
		return getBonus(this.performance, getCharismaMod());
	}


    public String getDamageVulnerabilities() {
		return this.damageVulnerabilities;
	}
    public String getDamageResistances() {
		return this.damageResistances;
	}
    public String getDamageImmunities() {
		return this.damageImmunities;
	}
    public String getConditionImmunities() {
		return this.conditionImmunities;
	}
    public String getSenses() {
		return this.senses;
	}
    public String getLanguages() {
		return this.languages;
	}
    public String getChallengeRating() {
		return this.challengeRating;
	}
    public String getSpecialAbilities() {
		return this.specialAbilities;
	}
    public String getActions() {
		return this.actions;
	}
    public String getLegendaryActions() {
		return this.legendaryActions;
	}


	public String getReactions() {
		return this.reactions;
	}

	//
    // The setters
    //

	//
	// The getters
	//


	public void setId(Long Id) {
		this.id = Id;
	}

	public void setName(String Name) {
		this.name = Name;
	}
	public void setSize(String Size) {
		this.size = Size;
	}
	public void setType(String Type) {
		this.type = Type;
	}
	public void setSubType(String Subtype) {
		this.subType = Subtype;
	}
	public void setAlignment(String Alignment) {
		this.alignment = Alignment;
	}
	public void setArmorClass(String ArmorClass) {
		this.armorClass = ArmorClass;
	}
	public void setHitPoints(String HitPoints) {
		this.hitPoints = HitPoints;
	}
	public void setHitDice(String HitDice) {
		this.hitDice = HitDice;
	}
	public void setSpeed(String Speed) {
		this.speed = Speed;
	}

	public void setStrength(int Strength) {
		this.strength = Strength;
	}

	protected static final int calcMod(int score)
	{
		return (score-10)/2;
	}

	protected static final int calcScore(int mod)
	{
		return mod*2+10;
	}

	public final int getStrengthMod()
	{
		return calcMod(getStrength());
	}

	public final int getDexterityMod()
	{
		return calcMod(getDexterity());
	}

	public final int getConstitutionMod()
	{
		return calcMod(getConstitution());
	}

	public final int getIntelligenceMod()
	{
		return calcMod(getIntelligence());
	}

	public final int getWisdomMod()
	{
		return calcMod(getWisdom());
	}

	public final int getCharismaMod()
	{
		return calcMod(getCharisma());
	}

	public void setStrengthSave(Integer StrengthSave) {
		this.strengthSave = StrengthSave;
	}
	public void setDexteritySave(Integer DexteritySave) {
		this.dexteritySave = DexteritySave;
	}
	public void setConstitutionSave(Integer ConstitutionSave) {
		this.constitutionSave = ConstitutionSave;
	}
	public void setIntelligenceSave(Integer IntelligenceSave) {
		this.intelligenceSave = IntelligenceSave;
	}
	public void setWisdomSave(Integer WisdomSave) {
		this.wisdomSave = WisdomSave;
	}
	public void setCharismaSave(Integer CharismaSave) {
		this.charismaSave = CharismaSave;
	}

	public void setHistory(Integer History) {
		this.history = History;
	}
	public void setPerception(Integer Perception) {
		this.perception = Perception;
	}
	public void setMedicine(Integer Medicine) {
		this.medicine = Medicine;
	}
	public void setReligion(Integer Religion) {
		this.religion = Religion;
	}
	public void setStealth(Integer Stealth) {
		this.stealth = Stealth;
	}
	public void setPersuasion(Integer Persuasion) {
		this.persuasion = Persuasion;
	}
	public void setInsight(Integer Insight) {
		this.insight = Insight;
	}
	public void setDeception(Integer Deception) {
		this.deception = Deception;
	}
	public void setArcana(Integer Arcana) {
		this.arcana = Arcana;
	}
	public void setAthletics(Integer Athletics) {
		this.athletics = Athletics;
	}
	public void setAcrobatics(Integer Acrobatics) {
		this.acrobatics = Acrobatics;
	}
	public void setSurvival(Integer Survival) {
		this.survival = Survival;
	}
	public void setInvestigation(Integer Investigation) {
		this.investigation = Investigation;
	}
	public void setNature(Integer Nature) {
		this.nature = Nature;
	}
	public void setIntimidation(Integer Intimidation) {
		this.intimidation = Intimidation;
	}
	public void setPerformance(Integer Performance) {
		this.performance = Performance;
	}


	public void setDamageVulnerabilities(String DamageVulnerabilities) {
		this.damageVulnerabilities = DamageVulnerabilities;
	}
	public void setDamageResistances(String DamageResistances) {
		this.damageResistances = DamageResistances;
	}
	public void setDamageImmunities(String DamageImmunities) {
		this.damageImmunities = DamageImmunities;
	}
	public void setConditionImmunities(String ConditionImmunities) {
		this.conditionImmunities = ConditionImmunities;
	}
	public void setSenses(String Senses) {
		this.senses = Senses;
	}
	public void setLanguages(String Languages) {
		this.languages = Languages;
	}
	public void setChallengeRating(String ChallengeRating) {
		this.challengeRating = ChallengeRating;
	}
	public void setSpecialAbilities(String SpecialAbilities) {
		this.specialAbilities = SpecialAbilities;
	}
	public void setActions(String Actions) {
		this.actions = Actions;
	}
	public void setLegendaryActions(String LegendaryActions) {
		this.legendaryActions = LegendaryActions;
	}


	public void setReactions(String Reactions) {
		this.reactions = Reactions;
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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}
