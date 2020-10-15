package com.haliksar.notepad.koin.di

import com.haliksar.notepad.koin.entity.Note
import org.koin.dsl.module

val NodePadListModule = module {
    factory {
        listOf(
            Note("fghfgh", "hgfhfgh"),
            Note("hfghfg", "dfgsdfg"),
            Note("hjjgh", "gdsg"),
            Note("sfgsdg", "fghjfg"),
            Note("fgjgfd", "sdgdsg"),
            Note("dfgfdg", "dgh"),
        )
    }
}