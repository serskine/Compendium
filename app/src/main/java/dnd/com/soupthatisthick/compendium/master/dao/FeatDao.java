package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.Feat;

/**
 * Created by Owner on 5/5/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

public interface FeatDao extends WriteDao<Long, Feat> {
    @Query("select * from FEATS T order by T.name")
    List<Feat> findAll();

    @Query("select * from FEATS T where T.id == :id")
    Feat load(Long id);
}