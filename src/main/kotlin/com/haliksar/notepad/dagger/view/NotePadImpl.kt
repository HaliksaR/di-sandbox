package com.haliksar.notepad.dagger.view

import com.haliksar.notepad.dagger.AppDagger
import com.haliksar.notepad.dagger.entity.Note
import javax.inject.Inject


class NotePadImpl : NoteBase() {
    @Inject
    override lateinit var list: List<Note>

    init {
        AppDagger.component.inject(this)
    }

    override fun show() {
        println("NotePadImpl")
        println(list.joinToString("\n"))
    }
}