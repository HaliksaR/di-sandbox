package com.haliksar.sabdbox.dagger.notepad.di

import com.haliksar.sabdbox.dagger.notepad.view.NoteBase
import com.haliksar.sabdbox.dagger.notepad.view.NotePad2Impl
import com.haliksar.sabdbox.dagger.notepad.view.NotePadImpl
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