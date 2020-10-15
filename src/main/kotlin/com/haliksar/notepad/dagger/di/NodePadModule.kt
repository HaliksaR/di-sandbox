package com.haliksar.notepad.dagger.di

import com.haliksar.notepad.dagger.view.NoteBase
import com.haliksar.notepad.dagger.view.NotePad2Impl
import com.haliksar.notepad.dagger.view.NotePadImpl
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module(includes = [NodePadListModule::class, NodePadListModule::class])
class NodePadModule {

    @Singleton
    @Provides
    @Named("NotePad")
    fun provideNotePad(): NoteBase = NotePadImpl()

    @Provides
    @Named("NotePad2")
    fun provideNotePad2(): NoteBase = NotePad2Impl()
}