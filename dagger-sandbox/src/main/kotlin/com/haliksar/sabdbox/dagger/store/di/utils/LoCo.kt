package com.haliksar.sabdbox.dagger.store.di.utils

import kotlin.reflect.KClass

object LoCo {

    val mapDeps = mutableMapOf<KClass<*>, Any>()
}

inline fun <reified T : Any> LoCo.get(): T =
    mapDeps[T::class] as? T ?: throw IllegalArgumentException("Locator get error")

fun <T : Any> LoCo.get(key: KClass<*>): T =
    mapDeps[key] as? T ?: throw IllegalArgumentException("Locator get error")

inline fun <reified T : Any> LoCo.putComponent(value: T) {
    mapDeps[T::class] = value
}
