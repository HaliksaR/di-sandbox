package com.haliksar.sabdbox.dagger.di

import com.haliksar.sabdbox.dagger.AppDagger
import com.haliksar.sabdbox.dagger.view.NotePad2Impl
import com.haliksar.sabdbox.dagger.view.NotePadImpl
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NodePadModule::class])
interface AppComponent {
    fun inject(app: AppDagger)
    fun inject(app: NotePad2Impl)
    fun inject(app: NotePadImpl)
}