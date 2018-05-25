package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.ItemOfList;

/**
 * Created by Owner on 4/18/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

public interface ItemOfListDao extends WriteDao<Long, ItemOfList> {
    @Query("select * from LIST_ITEMS T order by T.`table`, T.listId")
    List<ItemOfList> findAll();

    @Query("select * from LIST_ITEMS T where T.itemId == :id")
    ItemOfList load(Long id);
}
