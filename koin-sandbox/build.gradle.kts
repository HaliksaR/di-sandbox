plugins {
    kotlin("jvm") version "1.5.0"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(koin("koin-core"))
    implementation(koin("koin-core-ext"))
}

fun koin(module: String, version: String = "3.0.2"): String =
    "io.insert-koin:$module:$version"