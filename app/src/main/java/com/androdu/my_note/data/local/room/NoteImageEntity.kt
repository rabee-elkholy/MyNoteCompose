package com.androdu.my_note.data.local.room

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = NoteDetailsEntity::class,
            parentColumns = ["id"],
            childColumns = ["noteId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class NoteImageEntity(
    val imagePath: String,
    val noteId: String,
    @PrimaryKey val id: String = ""
)