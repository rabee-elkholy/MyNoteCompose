package com.androdu.my_note.domain.mapper

import com.androdu.my_note.data.local.room.CheckBoxEntity
import com.androdu.my_note.data.local.room.NoteDetailsEntity
import com.androdu.my_note.data.local.room.NoteEntity
import com.androdu.my_note.data.local.room.NoteImageEntity
import com.androdu.my_note.domain.model.Note
import com.androdu.my_note.domain.model.NoteCheckBox

fun NoteEntity.toNote(): Note {
    return Note(
        title = noteDetails.title,
        note = noteDetails.note,
        color = noteDetails.color,
        checkBoxes = checkBoxes.map { it.toNoteCheckBox() },
        images = images.map { it.imagePath }
    )
}

fun Note.toNoteEntity(): NoteEntity {
    val noteDetailsEntity = NoteDetailsEntity(
        title = title,
        note = note,
    )
    val checkBoxes = checkBoxes.map { it.toCheckBoxEntity(noteDetailsEntity.id) }
    val images = images.map { NoteImageEntity(imagePath = it, noteId = noteDetailsEntity.id) }

    return NoteEntity(
        noteDetails = noteDetailsEntity,
        checkBoxes = checkBoxes,
        images = images
    )
}

private fun CheckBoxEntity.toNoteCheckBox(): NoteCheckBox {
    return NoteCheckBox(
        title = title,
        isChecked = isChecked
    )
}

private fun NoteCheckBox.toCheckBoxEntity(noteId:String): CheckBoxEntity {
    return CheckBoxEntity(
        title = title,
        isChecked = isChecked,
        noteId = noteId
    )
}