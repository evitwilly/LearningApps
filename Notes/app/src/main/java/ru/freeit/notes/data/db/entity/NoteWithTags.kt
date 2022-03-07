package ru.freeit.notes.data.db.entity

import androidx.room.Embedded
import androidx.room.Relation

data class NoteWithTags(
    @Embedded val note: Note,
    @Relation(
        parentColumn = "id",
        entityColumn = "note_id"
    )
    val tags: List<Tag>
) {
    fun domain() = note.domain().copy(tags = tags.map { tag -> tag.domain() })
}