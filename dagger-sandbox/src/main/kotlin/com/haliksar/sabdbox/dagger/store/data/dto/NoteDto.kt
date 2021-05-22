package com.haliksar.sabdbox.dagger.store.data.dto

import com.haliksar.sabdbox.dagger.store.domain.entity.Note
import kotlinx.serialization.Serializable

@Serializable
internal data class NoteDto(
    val title: String,
    val description: String,
)

internal fun NoteDto.toEntity(): Note =
    Note(
        title = title,
        description = description,
    )