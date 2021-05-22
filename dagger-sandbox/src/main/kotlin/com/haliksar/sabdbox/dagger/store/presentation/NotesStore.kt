package com.haliksar.sabdbox.dagger.store.presentation

import com.haliksar.sabdbox.dagger.store.di.NotePadComponent
import com.haliksar.sabdbox.dagger.store.di.NotePadInjectableMarker
import com.haliksar.sabdbox.dagger.store.domain.entity.Note
import com.haliksar.sabdbox.dagger.store.domain.usecase.GetNotesUseCase
import com.haliksar.sabdbox.dagger.store.di.utils.Injectable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

internal class NotesStore @Inject constructor(
    private val getNotesUseCase: GetNotesUseCase,
) : NotePadInjectableMarker, Injectable<NotePadInjectableMarker>(NotePadComponent::class) {

    val notes = MutableSharedFlow<List<Note>>()

    private val scope = CoroutineScope(SupervisorJob())

    fun getNotes() {
        scope.launch {
            notes.emit(getNotesUseCase())
        }
    }
}