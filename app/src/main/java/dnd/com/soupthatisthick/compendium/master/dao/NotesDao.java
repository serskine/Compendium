package dnd.com.soupthatisthick.compendium.master.dao;

import android.arch.persistence.room.Query;

import java.util.List;

import dnd.com.soupthatisthick.compendium.common.ifaces.WriteDao;
import dnd.com.soupthatisthick.compendium.master.entity.Note;

/**
 * Created by Owner on 4/13/2017.
 * Copyright of Stuart Marr Erskine, all rights reserved.
 */
public interface NotesDao extends WriteDao<Long, Note> {
    @Query("select * from NOTES T order by T.title asc")
    List<Note> findAll();

    @Query("select * from NOTES T where T.id == :id")
    Note load(Long id);
}