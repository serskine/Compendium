package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.Armor;

/**
 * Created by Owner on 5/25/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

public interface ArmorDao extends WriteDao<Long, Armor> {
    @Query("select * from ARMOR A order by A.name, A.stealth, A.name asc")
    List<Armor> findAll();

    @Query("select * from ARMOR A where A.id == :id")
    Armor load(Long id);
}
