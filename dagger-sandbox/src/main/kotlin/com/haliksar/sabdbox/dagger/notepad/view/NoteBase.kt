package com.haliksar.sabdbox.dagger.notepad.view

import com.haliksar.sabdbox.dagger.notepad.entity.Note

abstract class NoteBase {

    protected abstract var list: List<Note>

    abstract fun show()
}