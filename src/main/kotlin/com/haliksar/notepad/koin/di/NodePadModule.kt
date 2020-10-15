package com.haliksar.notepad.koin.di

import com.haliksar.notepad.koin.view.NoteBase
import com.haliksar.notepad.koin.view.NotePad2Impl
import com.haliksar.notepad.koin.view.NotePadImpl
import org.koin.core.qualifier.named
import org.koin.dsl.module


val NodePadModule = module {
    single<NoteBase>(named("NotePad")) { NotePadImpl() }
    factory<NoteBase>(named("NotePad2")) { NotePad2Impl() }
}