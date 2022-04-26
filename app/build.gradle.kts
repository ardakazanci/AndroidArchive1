plugins {
    id ("com.android.application")
    id ("kotlin-android")
    id ("kotlin-android-extensions")
    id ("androidx.navigation.safeargs.kotlin")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
    id ("org.jlleitschuh.gradle.ktlint")
    id ("io.gitlab.arturbosch.detekt")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.mbobiosio.rickandmorty"
        minSdk = 23
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures{
        viewBinding = true
        dataBinding = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}

val navigation by extra("2.4.2")
val lifeCycleExtensionVersion by extra ("1.1.1")
val retrofitVersion by extra ("2.9.0")
val glideVersion by extra ("4.13.0")
val okHttp by extra ("4.9.3")
val room by extra ("2.4.2")
val timber by extra ("5.0.1")
val paging3 by extra ("3.1.1")
val coroutines by extra ("1.6.1")

dependencies {
    implementation ("androidx.core:core-ktx:1.7.0")
    implementation ("androidx.appcompat:appcompat:1.4.1")
    implementation ("com.google.android.material:material:1.7.0-alpha01")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.3")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")

    // Navigation Component
    implementation ("androidx.navigation:navigation-fragment-ktx:$navigation")
    implementation ("androidx.navigation:navigation-ui-ktx:$navigation")
    implementation ("androidx.navigation:navigation-dynamic-features-fragment:$navigation")

    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation ("com.squareup.retrofit2:converter-gson:$retrofitVersion")
    implementation ("com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion")

    // Room
    implementation ("androidx.room:room-runtime:$room")
    annotationProcessor ("androidx.room:room-compiler:$room")
    kapt ("androidx.room:room-compiler:$room")
    implementation ("androidx.room:room-ktx:$room")
    implementation ("androidx.room:room-paging:$room")

    // Okhttp
    implementation ("com.squareup.okhttp3:okhttp:$okHttp")
    implementation (Dependencies.LOGGING)

    // Lifecycle
    implementation ("android.arch.lifecycle:extensions:$lifeCycleExtensionVersion")

    // Coil
    implementation ("io.coil-kt:coil:1.4.0")

    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines")

    // Hilt
    implementation ("com.google.dagger:hilt-android:2.41")
    kapt ("com.google.dagger:hilt-android-compiler:2.41")
    implementation ("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
    kapt ("androidx.hilt:hilt-compiler:1.0.0")

    // Paging
    implementation ("androidx.paging:paging-runtime-ktx:$paging3")

    // Timber
    implementation ("com.jakewharton.timber:timber:$timber")

    //noinspection GradleCompatible
    implementation("androidx.palette:palette-ktx:1.0.0")

    implementation ("com.intuit.ssp:ssp-android:1.0.6") {
        because("An android lib that provides a new size unit - ssp (scalable sp). This size unit scales with the screen size based on the sp size unit (for texts). It can help Android developers with supporting multiple screens.")
    }
    implementation ("com.intuit.sdp:sdp-android:1.0.6") {
        because("An android lib that provides a new size unit - sdp (scalable dp). This size unit scales with the screen size. It can help Android developers with supporting multiple screens.")
    }

}
