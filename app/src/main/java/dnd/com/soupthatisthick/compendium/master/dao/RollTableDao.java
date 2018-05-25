package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.RollTable;

/**
 * Created by Owner on 5/9/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
public interface RollTableDao extends WriteDao<Long, RollTable> {
    @Query("select * from ROLL_TABLE T order by T.name asc")
    List<RollTable> findAll();

    @Query("select * from ROLL_TABLE T where T.id == :id")
    RollTable load(Long id);
}