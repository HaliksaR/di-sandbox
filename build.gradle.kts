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

    implementation("org.koin:koin-core:2.1.6")
    implementation("org.koin:koin-core-ext:2.1.6")
}