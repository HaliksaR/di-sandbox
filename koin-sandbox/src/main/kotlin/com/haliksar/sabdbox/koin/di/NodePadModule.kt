package com.haliksar.sabdbox.koin.di

import com.haliksar.sabdbox.koin.view.NoteBase
import com.haliksar.sabdbox.koin.view.NotePad2Impl
import com.haliksar.sabdbox.koin.view.NotePadImpl
import org.koin.core.qualifier.named
import org.koin.dsl.module


val NodePadModule = module {
    single<NoteBase>(named("NotePad")) { NotePadImpl() }
    factory<NoteBase>(named("NotePad2")) { NotePad2Impl() }
}