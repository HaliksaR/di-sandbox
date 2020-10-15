package com.haliksar.notepad.koin

import com.haliksar.notepad.koin.di.NodePadListModule
import com.haliksar.notepad.koin.di.NodePadModule
import com.haliksar.notepad.koin.view.NoteBase
import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.inject
import org.koin.core.qualifier.named

class AppKoin : KoinComponent {

    private val notepad: NoteBase by inject(named("NotePad"))

    private val notepad2: NoteBase by inject(named("NotePad2"))

    companion object {
        fun start() {
            println("Koin")
            val app = AppKoin()
            app.startApp()
        }
    }

    private fun startApp() {
        startKoin {
            modules(NodePadListModule, NodePadModule)
        }
        notepad.show()
        notepad2.show()
    }
}