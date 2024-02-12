package com.kamrul.noteapplication.data

import androidx.lifecycle.LiveData
import javax.inject.Inject

public class NoteRepository @Inject constructor(val notesDao: NotesDao) {

    var allNotes: LiveData<List<Note>> = notesDao.getAllNotes()

    suspend fun insert(note: Note) {
        notesDao.insert(note)
    }
    suspend fun delete(note: Note){
        notesDao.delete(note)
    }

    suspend fun update(note: Note){
        notesDao.update(note)
    }
}
