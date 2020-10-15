package com.haliksar.notepad.dagger.di

import com.haliksar.notepad.dagger.entity.Note
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [NodePadModule::class])
class NodePadListModule {

    @Singleton
    @Provides
    fun provideNotePadList(): List<Note> = listOf(
        Note("fghfgh", "hgfhfgh"),
        Note("hfghfg", "dfgsdfg"),
        Note("hjjgh", "gdsg"),
        Note("sfgsdg", "fghjfg"),
        Note("fgjgfd", "sdgdsg"),
        Note("dfgfdg", "dgh"),
    )
}