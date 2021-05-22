package com.haliksar.sabdbox.dagger.notepad.di

import com.haliksar.sabdbox.dagger.notepad.entity.Note
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