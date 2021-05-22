package com.haliksar.sabdbox.dagger.store.presentation

import com.haliksar.sabdbox.dagger.store.di.NotePadComponent
import com.haliksar.sabdbox.dagger.store.di.NotePadInjectableMarker
import com.haliksar.sabdbox.dagger.store.domain.usecase.GetNotepadNotificationUseCase
import com.haliksar.sabdbox.dagger.store.di.utils.Injectable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

internal class NotePadMessageStore @Inject constructor(
    private val getNotepadNotificationUseCase: GetNotepadNotificationUseCase,
) : NotePadInjectableMarker, Injectable<NotePadInjectableMarker>(NotePadComponent::class) {

    val noteMessage = MutableSharedFlow<String>()

    private val scope = CoroutineScope(SupervisorJob())

    fun getNotepadNotification() {
        scope.launch {
            noteMessage.emit(getNotepadNotificationUseCase().message)
        }
    }
}