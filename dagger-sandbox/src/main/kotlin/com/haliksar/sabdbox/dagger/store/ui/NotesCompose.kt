package com.haliksar.sabdbox.dagger.store.ui

import com.haliksar.sabdbox.dagger.store.di.*
import com.haliksar.sabdbox.dagger.store.di.utils.LoCo
import com.haliksar.sabdbox.dagger.store.di.utils.get
import com.haliksar.sabdbox.dagger.store.di.utils.putComponent
import com.haliksar.sabdbox.dagger.store.presentation.NotePadMessageStore
import com.haliksar.sabdbox.dagger.store.presentation.NotesStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking


fun main() = runBlocking {
    LoCo.putComponent(DaggerNotePadComponent.create())
    NotesCompose(
        NotesStore = LoCo.get<NotePadComponent>().getNotesStore(),
        NotePadMessageStore = LoCo.get<NotePadComponent>().getNotePadMessageStore(),
    ) {
        it.onEach(::println).launchIn(this@runBlocking)
    }
}

internal inline fun NotesCompose(NotesStore: NotesStore, NotePadMessageStore: NotePadMessageStore, callback: (Flow<*>) -> Unit) {
    with(NotesStore) {
        getNotes()
        callback(notes)
    }
    with(NotePadMessageStore) {
        getNotepadNotification()
        callback(noteMessage)
    }
}
