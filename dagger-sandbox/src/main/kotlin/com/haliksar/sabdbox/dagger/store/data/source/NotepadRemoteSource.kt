package com.haliksar.sabdbox.dagger.store.data.source

import com.haliksar.sabdbox.dagger.store.data.api.NotepadApi
import com.haliksar.sabdbox.dagger.store.data.dto.NoteDto
import com.haliksar.sabdbox.dagger.store.data.dto.toEntity
import com.haliksar.sabdbox.dagger.store.domain.entity.Note
import com.haliksar.sabdbox.dagger.store.domain.entity.NotepadNotification
import dagger.Binds
import dagger.Module
import javax.inject.Inject

@Module
internal interface SourceModule {

    @Binds
    fun bindSource(impl: NotepadRemoteSourceImpl): NotepadRemoteSource
}

internal interface NotepadRemoteSource {

    suspend fun getNoteList(): List<Note>

    suspend fun getNotepadNotification(): NotepadNotification
}

internal class NotepadRemoteSourceImpl @Inject constructor(
    private val api: NotepadApi,
) : NotepadRemoteSource {

    override suspend fun getNoteList(): List<Note> =
        api.getNoteList().map(NoteDto::toEntity)

    override suspend fun getNotepadNotification(): NotepadNotification =
        api.getNotepadNotification().toEntity()
}