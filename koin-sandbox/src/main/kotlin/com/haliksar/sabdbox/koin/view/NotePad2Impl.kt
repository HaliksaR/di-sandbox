package com.haliksar.sabdbox.koin.view

import com.haliksar.sabdbox.koin.entity.Note
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class NotePad2Impl : NoteBase(), KoinComponent {

    override val list: List<Note> by inject()

    override fun show() {
        println("NotePad2Impl")
        println(list.joinToString("\n"))
    }
}