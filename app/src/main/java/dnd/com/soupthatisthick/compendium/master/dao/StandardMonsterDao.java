package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.StandardMonster;

/**
 * Created by Owner on 3/13/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
public interface StandardMonsterDao extends WriteDao<Long, StandardMonster> {
    @Query("select * from STANDARD_MONSTERS T order by T.challenge_rating, T.name desc")
    List<StandardMonster> findAll();

    @Query("select * from STANDARD_MONSTERS T where T.id == :id")
    StandardMonster load(Long id);
}