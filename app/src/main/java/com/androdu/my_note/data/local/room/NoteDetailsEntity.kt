package com.androdu.my_note.data.local.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDetailsEntity(
    val title: String,
    val note: String,
    val color: Int = 0,
    @PrimaryKey val id: String = ""
)