plugins {
    kotlin("jvm") version "1.4.10"
    kotlin("kapt") version "1.4.10"
}

apply(plugin = "koin")

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath("org.koin:koin-gradle-plugin:2.1.6")
    }
}


dependencies {
    implementation(kotlin("stdlib"))
    implementation(dagger("dagger"))
    kapt(dagger("dagger-compiler"))

    implementation("org.koin:koin-core:2.1.6")
    implementation("org.koin:koin-core-ext:2.1.6")
}

fun DependencyHandler.dagger(module: String, version: String = "2.29.1"): Any =
    "com.google.dagger:$module:$version"