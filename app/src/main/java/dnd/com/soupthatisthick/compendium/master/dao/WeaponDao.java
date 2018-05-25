package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.RoomDatabase;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.common.impls.WriteDaoImpl;
import dnd.com.soupthatisthick.compendium.master.entity.Weapon;

/**
 * Created by Owner on 5/25/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
@Dao
public abstract class WeaponDao extends WriteDaoImpl<Long, Weapon> {
    public WeaponDao(RoomDatabase database) {
        super(database, "WEAPONS");
    }

    @Query("select * from WEAPONS T order by T.name, T.type desc")
    public abstract List<Weapon> findAll();

    @Query("select * from WEAPONS T where T.id == :id")
    public abstract Weapon load(Long id);
}