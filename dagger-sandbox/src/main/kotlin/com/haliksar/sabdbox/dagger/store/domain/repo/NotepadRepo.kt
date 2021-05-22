package com.haliksar.sabdbox.dagger.store.domain.repo

import com.haliksar.sabdbox.dagger.store.domain.entity.Note
import com.haliksar.sabdbox.dagger.store.domain.entity.NotepadNotification

internal interface NotepadRepo {

    suspend fun getNoteList(): List<Note>

    suspend fun getNotepadNotification(): NotepadNotification
}