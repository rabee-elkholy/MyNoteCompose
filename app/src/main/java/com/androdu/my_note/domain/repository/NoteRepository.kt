package com.androdu.my_note.domain.repository

import com.androdu.my_note.domain.model.Note

interface NoteRepository {
    suspend fun insert(note: Note)
    suspend fun getAllNotes(): List<Note>
}