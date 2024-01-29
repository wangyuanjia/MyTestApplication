// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}

//apply from:'libs.gradle.kts'

apply {
    from(file("libs.gradle.kts"))
}

//apply(from =file("libs.gradle.kts") )

ext {
    var isDebug = false
    var test = mutableMapOf<String,String>().apply {
        this["test"] = "junit:junit:4.13.2"
    }
}