package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.Background;

/**
 * Created by Owner on 5/8/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

public interface BackgroundDao extends WriteDao<Long, Background> {
    @Query("select * from BACKGROUND B order by B.name, B.skills, B.languages, B.tools asc")
    List<Background> findAll();

    @Query("select * from BACKGROUND B where B.id == :id")
    Background load(Long id);
}
