package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.MagicItem;

/**
 * Created by Owner on 2/2/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
public interface MagicItemDao extends WriteDao<Long, MagicItem> {
    @Query("select * from MAGIC_ITEMS T order by T.name, T.type, T.rarity, T.attunement asc")
    List<MagicItem> findAll();

    @Query("select * from MAGIC_ITEMS T where T.id == :id")
    MagicItem load(Long id);
}