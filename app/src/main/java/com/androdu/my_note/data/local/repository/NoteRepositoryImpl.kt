package com.androdu.my_note.data.local.repository

import com.androdu.my_note.data.local.room.dao.NoteDao
import com.androdu.my_note.domain.mapper.toNote
import com.androdu.my_note.domain.mapper.toNoteEntity
import com.androdu.my_note.domain.model.Note
import com.androdu.my_note.domain.repository.NoteRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NoteRepositoryImpl @Inject constructor(
    private val dao: NoteDao
) : NoteRepository {
    override suspend fun insert(note: Note) {
        dao.insertNote(note.toNoteEntity())
    }

    override suspend fun getAllNotes(): List<Note> {
        return dao.getAllNotes().map { it.toNote() }
    }
}