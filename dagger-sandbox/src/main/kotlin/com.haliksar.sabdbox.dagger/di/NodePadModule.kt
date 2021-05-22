package com.haliksar.sabdbox.dagger.di

import com.haliksar.sabdbox.dagger.view.NoteBase
import com.haliksar.sabdbox.dagger.view.NotePad2Impl
import com.haliksar.sabdbox.dagger.view.NotePadImpl
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