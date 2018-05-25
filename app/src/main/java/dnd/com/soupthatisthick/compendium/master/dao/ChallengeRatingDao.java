package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.ChallengeRating;

/**
 * Created by Owner on 5/8/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

public interface ChallengeRatingDao extends WriteDao<Long, ChallengeRating> {
    @Query("select * from CR_DETAILS T order by T.value asc")
    List<ChallengeRating> findAll();

    @Query("select * from CR_DETAILS T where T.id == :id")
    ChallengeRating load(Long id);
}
