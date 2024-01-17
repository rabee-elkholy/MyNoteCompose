package com.androdu.my_note.data.local.room.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.androdu.my_note.data.local.room.CheckBoxEntity
import com.androdu.my_note.data.local.room.NoteDetailsEntity
import com.androdu.my_note.data.local.room.NoteImageEntity

@Database(
    entities = [NoteDetailsEntity::class, CheckBoxEntity::class, NoteImageEntity::class],
    version = 1,
    exportSchema = false
)
abstract class MyNoteDatabase: RoomDatabase() {
    abstract val dao: NoteDao
}