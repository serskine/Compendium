package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.LifeStyle;

/**
 * Created by Owner on 5/25/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

public interface LifeStyleDao extends WriteDao<Long, LifeStyle> {
    @Query("select * from LIFESTYLE T order by T.name asc")
    List<LifeStyle> findAll();

    @Query("select * from LIFESTYLE T where T.id == :id")
    LifeStyle load(Long id);
}