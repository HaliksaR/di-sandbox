package com.haliksar.notepad.koin.view

import com.haliksar.notepad.dagger.entity.Note

abstract class NoteBase {
    protected abstract val list: List<Note>
    abstract fun show()
}