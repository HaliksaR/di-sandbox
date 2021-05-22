package com.haliksar.sabdbox.dagger.store.domain.usecase

import com.haliksar.sabdbox.dagger.store.domain.entity.Note
import com.haliksar.sabdbox.dagger.store.domain.repo.NotepadRepo
import javax.inject.Inject

internal class GetNotesUseCase @Inject constructor(
    private val repo: NotepadRepo,
) {
    suspend operator fun invoke(): List<Note> =
        repo.getNoteList()
}