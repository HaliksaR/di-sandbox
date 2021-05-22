plugins {
    kotlin("jvm") version "1.5.0"
    kotlin("kapt") version "1.5.0"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(dagger("dagger"))
    kapt(dagger("dagger-compiler"))
}

fun dagger(module: String, version: String = "2.35.1"): String =
    "com.google.dagger:$module:$version"
