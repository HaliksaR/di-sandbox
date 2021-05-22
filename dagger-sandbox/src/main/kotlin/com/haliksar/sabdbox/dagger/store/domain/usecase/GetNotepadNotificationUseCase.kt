package com.haliksar.sabdbox.dagger.store.domain.usecase

import com.haliksar.sabdbox.dagger.store.domain.entity.NotepadNotification
import com.haliksar.sabdbox.dagger.store.domain.repo.NotepadRepo
import javax.inject.Inject

internal class GetNotepadNotificationUseCase @Inject constructor(
    private val repo: NotepadRepo,
) {
    suspend operator fun invoke(): NotepadNotification =
        repo.getNotepadNotification()
}
