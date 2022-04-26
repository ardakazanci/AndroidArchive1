
object AndroidBuild {
    const val COMPILE_SDK = 31
    const val APPLICATION_ID = "com.getcounsel.android"
    const val MIN_ANDROID_SDK = 23
    const val TARGET_ANDROID_SDK = 31
    const val VERSION_CODE = 1
    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
    val versionName by lazy {
        val x = VERSION_CODE / 10_000
        val y = (VERSION_CODE % 10_000) / 100
        val z = VERSION_CODE % 100

        //val date = SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Date())
        "$x.$y.$z"
        //
    }

}
object AndroidX {
    const val KOTLIN_VERSION = "1.5.31"
}

object Versions {
    const val LOGGING = "4.9.0"

}