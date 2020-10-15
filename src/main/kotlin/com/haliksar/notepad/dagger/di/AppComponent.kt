package com.haliksar.notepad.dagger.di

import com.haliksar.notepad.dagger.AppDagger
import com.haliksar.notepad.dagger.view.NotePad2Impl
import com.haliksar.notepad.dagger.view.NotePadImpl
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NodePadModule::class])
interface AppComponent {
    fun inject(app: AppDagger)
    fun inject(app: NotePad2Impl)
    fun inject(app: NotePadImpl)
}