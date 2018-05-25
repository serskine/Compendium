package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.CustomMonster;

/**
 * Created by Owner on 1/28/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

public interface CustomMonsterDao extends WriteDao<Long, CustomMonster> {
    @Query("select * from CUSTOM_MONSTERS T order by T.cr, T.name")
    List<CustomMonster> findAll();

    @Query("select * from CONTACTS T where T.id == :id")
    CustomMonster load(Long id);
}