package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.Mount;

/**
 * Created by Owner on 5/25/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
public interface MountDao extends WriteDao<Long, Mount> {
    @Query("select * from MOUNTS T order by T.name asc")
    List<Mount> findAll();

    @Query("select * from MOUNTS T where T.id == :id")
    Mount load(Long id);
}