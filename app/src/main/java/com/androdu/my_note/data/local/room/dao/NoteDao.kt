package com.androdu.my_note.data.local.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.androdu.my_note.data.local.room.CheckBoxEntity
import com.androdu.my_note.data.local.room.NoteDetailsEntity
import com.androdu.my_note.data.local.room.NoteEntity
import com.androdu.my_note.data.local.room.NoteImageEntity

@Dao
interface NoteDao {
    @Insert
    fun insertNoteDetails(noteDetails: NoteDetailsEntity)

    @Insert
    fun insertCheckBoxes(checkboxes: List<CheckBoxEntity>)

    @Insert
    fun insertNoteImages(noteImages: List<NoteImageEntity>)

    @Transaction
    fun insertNote(note: NoteEntity) {

        insertNoteDetails(note.noteDetails)
        insertCheckBoxes(note.checkBoxes)
        insertNoteImages(note.images)
    }

    @Transaction
    @Query("SELECT * FROM NoteDetailsEntity")
    fun getAllNotes(): List<NoteEntity>
}
