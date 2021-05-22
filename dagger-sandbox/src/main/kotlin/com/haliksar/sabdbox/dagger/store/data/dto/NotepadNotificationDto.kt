package com.haliksar.sabdbox.dagger.store.data.dto

import com.haliksar.sabdbox.dagger.store.domain.entity.NotepadNotification
import kotlinx.serialization.Serializable

@Serializable
internal data class NotepadNotificationDto(
    val message: String
)

internal fun NotepadNotificationDto.toEntity(): NotepadNotification =
    NotepadNotification(
        message = message,
    )