package com.androdu.my_note.data.local.room

import androidx.room.Embedded
import androidx.room.Relation

data class NoteEntity(
    @Embedded
    val noteDetails: NoteDetailsEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "noteId"
    )
    val checkBoxes: List<CheckBoxEntity> = emptyList(),
    @Relation(
        parentColumn = "id",
        entityColumn = "noteId"
    )
    val images: List<NoteImageEntity> = emptyList()
)