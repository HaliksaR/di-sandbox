package com.haliksar.sabdbox.dagger.notepad.view

import com.haliksar.sabdbox.dagger.notepad.AppDagger
import com.haliksar.sabdbox.dagger.notepad.entity.Note
import javax.inject.Inject

class NotePad2Impl : NoteBase() {

    @Inject
    override lateinit var list: List<Note>

    init {
        AppDagger.component.inject(this)
    }

    override fun show() {
        println("NotePad2Impl")
        println(list.joinToString("\n"))
    }
}