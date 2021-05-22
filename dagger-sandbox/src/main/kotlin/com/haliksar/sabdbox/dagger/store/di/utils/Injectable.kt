package com.haliksar.sabdbox.dagger.store.di.utils

import kotlin.reflect.KClass

abstract class Injectable<INJ>(componentKClass: KClass<*>) {

    init {
        check(Injector::class.java.isAssignableFrom(componentKClass.java)) {
            "Injectable ERROR: component hasn't Injector<T>"
        }
        inject(componentKClass)
    }

    private fun inject(componentKClass: KClass<*>) {
        LoCo.get<Injector<INJ>>(componentKClass).inject(this as INJ)
    }
}