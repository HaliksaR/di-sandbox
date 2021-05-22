package com.haliksar.sabdbox.koin.view

import com.haliksar.sabdbox.koin.entity.Note

abstract class NoteBase {
    
    protected abstract val list: List<Note>
    
    abstract fun show()
}