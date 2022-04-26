// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    /*repositories {
        google()
        jcenter()
    }*/
    dependencies {
        //classpath 'com.android.tools.build:gradle:7.1.1'
        //classpath 'org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10'
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.4.1")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.40.5")
        classpath ("org.jlleitschuh.gradle:ktlint-gradle:10.2.0")
        classpath ("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.18.1")

    }
}

plugins {
    id ("com.android.application") version ("7.1.1") apply false
    id ("com.android.library") version ("7.1.1") apply false
    id ("org.jetbrains.kotlin.android") version ("1.6.10") apply false
    id ("org.jlleitschuh.gradle.ktlint") version ("10.2.0")
}

/*
allprojects {
    repositories {
        google()
        jcenter()
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}*/
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}