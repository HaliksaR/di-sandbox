package com.haliksar.sabdbox.dagger.notepad

import com.haliksar.sabdbox.dagger.notepad.di.AppComponent
import com.haliksar.sabdbox.dagger.notepad.view.NoteBase
import com.haliksar.sabdbox.dagger.notepad.di.DaggerAppComponent
import javax.inject.Inject
import javax.inject.Named

class AppDagger {

    @Inject
    @Named("NotePad")
    lateinit var notepad: NoteBase

    @Inject
    @Named("NotePad2")
    lateinit var notepad2: NoteBase

    companion object {
        internal val component: AppComponent by lazy {
            DaggerAppComponent.builder().build()
        }

        fun start() {
            println("Dagger")
            val app = AppDagger()
            app.startApp()
        }
    }

    fun startApp() {
        component.inject(this)
        notepad.show()
        notepad2.show()
    }
}

fun main() {
    AppDagger.start()
}