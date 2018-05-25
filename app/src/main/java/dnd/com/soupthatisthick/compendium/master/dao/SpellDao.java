package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.Spell;

/**
 * Created by Owner on 1/28/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
public interface SpellDao extends WriteDao<Long, Spell> {
    @Query("select * from EDITABLE_SPELLS T order by T.name, T.level asc")
    List<Spell> findAll();

    @Query("select * from EDITABLE_SPELLS T where T.id == :id")
    Spell load(Long id);
}