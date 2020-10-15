package com.haliksar.notepad.dagger.view

import com.haliksar.notepad.dagger.entity.Note

abstract class NoteBase {
    protected abstract var list: List<Note>
    abstract fun show()
}