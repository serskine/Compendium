package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.God;

/**
 * Created by Owner on 5/25/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

public interface GodsDao extends WriteDao<Long, God> {
    @Query("select * from GODS T order by T.name")
    List<God> findAll();

    @Query("select * from GODS T where T.id == :id")
    God load(Long id);
}