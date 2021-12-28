plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation( "androidx.compose.compiler:compiler:1.1.0-rc02")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "com.example.todoapp.android"
        minSdk = 26
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        // Enables Jetpack Compose for this module
        compose = true
    }
    composeOptions {
        kotlinCompilerVersion = "1.6.10"
        kotlinCompilerExtensionVersion = "1.1.0-rc02"
    }
}

dependencies {
    implementation(project(":shared"))
    //implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.4.0")
    //implementation("androidx.constraintlayout:constraintlayout:2.1.0")

    // Integration with activities
    implementation("androidx.activity:activity-compose:1.4.0")
    // Compose Material Design
    implementation( "androidx.compose.material:material:1.0.5")
    // Animations
    implementation( "androidx.compose.animation:animation:1.0.5")
    // Tooling support (Previews, etc.)
    implementation( "androidx.compose.ui:ui-tooling:1.0.5")
}