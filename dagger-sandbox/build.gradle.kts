plugins {
    kotlin("jvm") version "1.5.0"
    kotlin("kapt") version "1.5.0"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.5.0"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(dagger("dagger"))
    kapt(dagger("dagger-compiler"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.1")
}

fun dagger(module: String, version: String = "2.35.1"): String =
    "com.google.dagger:$module:$version"
