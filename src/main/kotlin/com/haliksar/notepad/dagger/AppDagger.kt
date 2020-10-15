package com.haliksar.notepad.dagger

import com.haliksar.notepad.dagger.di.AppComponent
import com.haliksar.notepad.dagger.di.DaggerAppComponent
import com.haliksar.notepad.dagger.view.NoteBase
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