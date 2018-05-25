package dnd.com.soupthatisthick.compendium.master.dbase;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;
import android.support.annotation.NonNull;

import dnd.com.soupthatisthick.compendium.master.dao.WeaponDao;
import dnd.com.soupthatisthick.compendium.master.entity.Weapon;

@Database(
        entities = {
//                Armor.class,
//                Background.class,
//                ChallengeRating.class,
//                Condition.class,
//                Container.class,
//                Contact.class,
//                CustomMonster.class,
//                Equipment.class,
//                Feat.class,
//                God.class,
//                ItemOfList.class,
//                ItemList.class,
//                Level.class,
//                LifeStyle.class,
//                MagicItem.class,
//                Mount.class,
//                Note.class,
//                Pc.class,
//                RaceFeatures.class,
//                RollTable.class,
//                RollTableEntry.class,
//                SearchFilter.class,
//                Session.class,
//                Setting.class,
//                Spell.class,
//                StandardMonster.class,
//                Table.class,
                Weapon.class
        },
        version=1,
        exportSchema = false
)
public abstract class MasterDatabase extends RoomDatabase {

    private static MasterDatabase instance = null;
    private static boolean inMemory = true;

    public static boolean isInMemory() {
        return inMemory;
    }

//    public abstract ArmorDao armorDao();
//    public abstract BackgroundDao backgroundDao();
//    public abstract ChallengeRatingDao challengeRatingDao();
//    public abstract ConditionDao conditionDao();
//    public abstract ContactDao contactDao();
//    public abstract ContentValuesDao contentValuesDao();
//    public abstract CustomMonsterDao customMonsterDao();
//    public abstract EquipmentDao equipmentDao();
//    public abstract FeatDao featDao();
//    public abstract GodsDao godsDao();
//    public abstract ItemDao itemDao();
//    public abstract ItemOfListDao itemListDao();
//    public abstract LevelDao levelDao();
//    public abstract LifeStyleDao lifeStyleDao();
//    public abstract MagicItemDao magicItemDao();
//    public abstract MountDao mountDao();
//    public abstract NotesDao notesDao();
//    public abstract PcDao pcDao();
//    public abstract RollTableDao rollTableDao();
//    public abstract RollTableEntryDao rollTableEntryDao();
//    public abstract SearchFilterDao searchFilterDao();
//    public abstract SessionDao sessionDao();
//    public abstract SettingDao settingDao();
//    public abstract SpellDao spellDao();
//    public abstract StandardMonsterDao standardMonsterDao();
//    public abstract TableDao tableDao();

    public abstract WeaponDao weaponDao();



    /**
     * This method will be used to create the database when required
     * @param context is where we are building the database from
     * @return the {@link MasterDatabase}
     */
    public static MasterDatabase getInstance(Context context, boolean isInMemory) {

        if (instance==null || isInMemory != isInMemory()) {
            inMemory = isInMemory;
            Builder<MasterDatabase> builder =
                    (isInMemory())
                            ? Room.inMemoryDatabaseBuilder(context.getApplicationContext(), MasterDatabase.class)
                            : Room.databaseBuilder(context.getApplicationContext(), MasterDatabase.class, "dnd.db");

            // We have built the database (in memory or from file) now apply the migrations and build it.
            instance = builder.addMigrations(MIGRATION_1_2)
                    .build();
        }
        return instance;
    }

    /**
     * Handles the migrations from version one to two
     */
    static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {
            // There is no modification of the database at this point.
        }
    };


}