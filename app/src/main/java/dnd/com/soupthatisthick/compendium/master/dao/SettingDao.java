package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.Setting;

/**
 * Created by Owner on 5/28/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
public interface SettingDao extends WriteDao<Long, Setting> {
    @Query("select * from SETTINGS T order by T.name asc")
    List<Setting> findAll();

    @Query("select * from SETTINGS T where T.id == :id")
    Setting load(Long id);
}