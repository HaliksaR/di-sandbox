package com.haliksar.sabdbox.dagger.store.di

import com.haliksar.sabdbox.dagger.store.data.api.ApiModule
import com.haliksar.sabdbox.dagger.store.data.repo.RepoModule
import com.haliksar.sabdbox.dagger.store.data.source.SourceModule
import com.haliksar.sabdbox.dagger.store.di.utils.Injector
import com.haliksar.sabdbox.dagger.store.presentation.NotePadMessageStore
import com.haliksar.sabdbox.dagger.store.presentation.NotesStore
import dagger.Component

@Component(
    modules = [
        ApiModule::class,
        SourceModule::class,
        RepoModule::class,
    ]
)
internal interface NotePadComponent : Injector<NotePadInjectableMarker> {

    fun getNotesStore(): NotesStore

    fun getNotePadMessageStore(): NotePadMessageStore
}