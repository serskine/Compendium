package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.SearchFilter;

/**
 * Created by Owner on 5/4/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
public interface SearchFilterDao extends WriteDao<Long, SearchFilter> {
    @Query("select * from DAO_SEARCHABLE T order by T.`table`, T.`column` asc")
    List<SearchFilter> findAll();

    @Query("select * from DAO_SEARCHABLE T where T.id == :id")
    SearchFilter load(Long id);
}