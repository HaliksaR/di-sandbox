package com.haliksar.sabdbox.dagger.view

import com.haliksar.sabdbox.dagger.AppDagger
import com.haliksar.sabdbox.dagger.entity.Note
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