package com.haliksar.sabdbox.dagger.notepad.di

import com.haliksar.sabdbox.dagger.notepad.AppDagger
import com.haliksar.sabdbox.dagger.notepad.view.NotePad2Impl
import com.haliksar.sabdbox.dagger.notepad.view.NotePadImpl
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NodePadModule::class])
interface AppComponent {
    fun inject(app: AppDagger)
    fun inject(app: NotePad2Impl)
    fun inject(app: NotePadImpl)
}