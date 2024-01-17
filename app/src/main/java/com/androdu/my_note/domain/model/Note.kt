package com.androdu.my_note.domain.model

data class Note(
    val title: String,
    val note: String,
    val color: Int,
    val checkBoxes: List<NoteCheckBox>,
    val images: List<String>
)

data class NoteCheckBox(
    val title: String,
    val isChecked: Boolean
)
