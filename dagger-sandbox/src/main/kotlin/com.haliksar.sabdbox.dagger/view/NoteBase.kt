package com.haliksar.sabdbox.dagger.view

import com.haliksar.sabdbox.dagger.entity.Note

abstract class NoteBase {

    protected abstract var list: List<Note>

    abstract fun show()
}