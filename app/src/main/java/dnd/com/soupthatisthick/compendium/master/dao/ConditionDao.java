package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.Condition;

/**
 * Created by Owner on 5/8/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

public interface ConditionDao extends WriteDao<Long, Condition> {
    @Query("select * from CONDITIONS T order by T.name asc")
    List<Condition> findAll();

    @Query("select * from CONDITIONS T where T.id == :id")
    Condition load(Long id);
}
