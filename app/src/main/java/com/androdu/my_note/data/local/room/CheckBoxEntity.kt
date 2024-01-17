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
data class CheckBoxEntity(
    val title: String,
    val isChecked: Boolean,
    val noteId: String,
    @PrimaryKey val id: String = ""
)
