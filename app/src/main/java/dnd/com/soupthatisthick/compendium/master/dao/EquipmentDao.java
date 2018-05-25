package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.Equipment;

/**
 * Created by Owner on 5/25/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

public interface EquipmentDao extends WriteDao<Long, Equipment> {
    @Query("select * from EQUIPMENT T order by T.name, T.type")
    List<Equipment> findAll();

    @Query("select * from EQUIPMENT T where T.id == :id")
    Equipment load(Long id);
}