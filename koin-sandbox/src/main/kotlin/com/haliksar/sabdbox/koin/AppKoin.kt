package com.haliksar.sabdbox.koin

import com.haliksar.sabdbox.koin.di.NodePadListModule
import com.haliksar.sabdbox.koin.di.NodePadModule
import com.haliksar.sabdbox.koin.view.NoteBase
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
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

fun main() {
    AppKoin.start()
}