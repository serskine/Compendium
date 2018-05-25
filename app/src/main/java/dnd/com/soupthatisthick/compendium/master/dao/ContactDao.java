package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.Contact;

/**
 * Created by Owner on 5/1/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */

public interface ContactDao extends WriteDao<Long, Contact> {
    @Query("select * from CONTACTS T order by T.name, T.dci asc")
    List<Contact> findAll();

    @Query("select * from CONTACTS T where T.id == :id")
    Contact load(Long id);
}