plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.appcompat:appcompat:1.2.0")

    implementation ("androidx.compose.ui:ui:1.0.0-alpha09")
    // Tooling support (Previews, etc.)
    implementation ("androidx.compose.ui:ui-tooling:1.0.0-alpha09")
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation ("androidx.compose.foundation:foundation:1.0.0-alpha09")
    // Material Design
    implementation ("androidx.compose.material:material:1.0.0-alpha09")
    // Material design icons
    implementation ("androidx.compose.material:material-icons-core:1.0.0-alpha09")
    implementation ("androidx.compose.material:material-icons-extended:1.0.0-alpha09")
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "com.nomtek.kmmexample.androidApp"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }

    composeOptions {
        kotlinCompilerVersion = "1.4.21"
        kotlinCompilerExtensionVersion = "1.0.0-alpha09"
    }
}