package com.haliksar.sabdbox.dagger.store.data.repo

import com.haliksar.sabdbox.dagger.store.data.source.NotepadRemoteSource
import com.haliksar.sabdbox.dagger.store.domain.entity.Note
import com.haliksar.sabdbox.dagger.store.domain.entity.NotepadNotification
import com.haliksar.sabdbox.dagger.store.domain.repo.NotepadRepo
import dagger.Binds
import dagger.Module
import javax.inject.Inject

@Module
internal interface RepoModule {

    @Binds
    fun bindRepo(impl: NotepadRepoImpl): NotepadRepo
}

internal class NotepadRepoImpl @Inject constructor(
    private val remoteSource: NotepadRemoteSource,
) : NotepadRepo {

    override suspend fun getNoteList(): List<Note> =
        remoteSource.getNoteList()

    override suspend fun getNotepadNotification(): NotepadNotification =
        remoteSource.getNotepadNotification()
}