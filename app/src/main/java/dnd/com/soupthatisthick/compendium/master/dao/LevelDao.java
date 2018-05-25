package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.Level;

/**
 * Created by Owner on 5/8/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
public interface LevelDao extends WriteDao<Long, Level> {
    @Query("select * from LEVEL_DETAILS T order by T.level desc")
    List<Level> findAll();

    @Query("select * from LEVEL_DETAILS T where T.id == :id")
    Level load(Long id);
}