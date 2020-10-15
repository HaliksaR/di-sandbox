plugins {
    kotlin("jvm") version "1.4.10"
    kotlin("kapt") version "1.4.10"
}

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
}


dependencies {
    implementation(kotlin("stdlib"))
    implementation(dagger("dagger"))
    kapt(dagger("dagger-compiler"))
}

fun DependencyHandler.dagger(module: String, version: String = "2.29.1"): Any =
    "com.google.dagger:$module:$version"