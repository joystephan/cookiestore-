plugins {
    id("com.android.application") version "8.6.0" apply false
    id("com.android.library") version "8.6.0" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}