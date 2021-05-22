package com.haliksar.sabdbox.dagger.store.data.api

import com.haliksar.sabdbox.dagger.store.data.dto.NoteDto
import com.haliksar.sabdbox.dagger.store.data.dto.NotepadNotificationDto
import dagger.Binds
import dagger.Module
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import javax.inject.Inject

@Module
internal interface ApiModule {

    @Binds
    fun bindApi(impl: NotepadApiImpl): NotepadApi
}

internal interface NotepadApi {

    suspend fun getNoteList(): List<NoteDto>

    suspend fun getNotepadNotification(): NotepadNotificationDto
}

internal class NotepadApiImpl @Inject constructor() : NotepadApi {

    private companion object {

        const val noteListJson =
            """[ {"title": "1", "description": "1" }, {"title": "2", "description": "2" }, {"title": "3", "description": "3" } ]"""

        const val notepadNotificationJson =
            """{ "message" : "notepadNotificationJson" }"""
    }

    override suspend fun getNoteList(): List<NoteDto> =
        Json.decodeFromString(noteListJson)

    override suspend fun getNotepadNotification(): NotepadNotificationDto =
        Json.decodeFromString(notepadNotificationJson)
}