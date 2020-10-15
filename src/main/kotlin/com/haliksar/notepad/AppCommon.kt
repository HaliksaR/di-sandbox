package com.haliksar.notepad

import com.haliksar.notepad.dagger.AppDagger
import com.haliksar.notepad.koin.AppKoin

fun main() {
    AppDagger.start()
    AppKoin.start()
}