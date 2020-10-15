package com.haliksar.notepad.koin.view

import com.haliksar.notepad.dagger.entity.Note
import org.koin.core.KoinComponent
import org.koin.core.inject

class NotePad2Impl : NoteBase(), KoinComponent {

    override val list: List<Note> by inject()

    override fun show() {
        println("NotePad2Impl")
        println(list.joinToString("\n"))
    }
}