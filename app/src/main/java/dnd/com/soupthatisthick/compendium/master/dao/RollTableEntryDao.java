package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.RollTableEntry;

/**
 * Created by Owner on 5/9/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
public interface RollTableEntryDao extends WriteDao<Long, RollTableEntry> {
    @Query("select * from ROLL_TABLE_ENTRY T order by T.tableId, T.entryId asc")
    List<RollTableEntry> findAll();

    @Query("select * from ROLL_TABLE_ENTRY T where T.tableId == :id")
    RollTableEntry load(Long id);
}