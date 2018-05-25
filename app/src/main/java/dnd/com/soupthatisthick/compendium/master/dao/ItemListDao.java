package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.ItemList;

/**
 * Created by Owner on 4/18/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
public interface ItemListDao extends WriteDao<Long, ItemList> {
    @Query("select * from LISTS T order by T.name")
    List<ItemList> findAll();

    @Query("select * from LISTS T where T.id == :id")
    ItemList load(Long id);
}
