import java.util.Properties

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

// ─── Signing config: loaded from environment or local keystore.properties ─────
val keystorePropertiesFile = rootProject.file("keystore.properties")
val keystoreProperties = Properties()
if (keystorePropertiesFile.exists()) {
    keystoreProperties.load(keystorePropertiesFile.inputStream())
}

android {
    namespace = "io.kitchen.meater"
    compileSdk = 35

    defaultConfig {
        applicationId = "io.kitchen.meater"
        minSdk = 29
        targetSdk = 35
        versionCode = 10
        versionName = "0.10.0.9"

        // GIT_BRANCH is injected by the build-apk.yml workflow so the version line in
        // the app shows which branch the APK was built from (e.g. "copilot/fix-…").
        // Falls back to "local" for developer builds.
        buildConfigField(
            "String", "GIT_BRANCH",
            "\"${System.getenv("GIT_BRANCH") ?: "local"}\""
        )

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    signingConfigs {
        create("release") {
            // Keys come from CI secrets (env vars) or from keystore.properties for local builds.
            // keystore.properties is gitignored — never commit the keystore or passwords.
            storeFile = file(
                System.getenv("KEYSTORE_PATH")
                    ?: keystoreProperties.getProperty("storeFile", "meater-release.keystore")
            )
            storePassword = System.getenv("KEYSTORE_PASSWORD")
                ?: keystoreProperties.getProperty("storePassword", "")
            keyAlias = System.getenv("KEY_ALIAS")
                ?: keystoreProperties.getProperty("keyAlias", "meater")
            keyPassword = System.getenv("KEY_PASSWORD")
                ?: keystoreProperties.getProperty("keyPassword", "")
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            // Sign the release APK if keystore env vars are present; otherwise skip signing
            val keystoreAvailable =
                System.getenv("KEYSTORE_PATH") != null ||
                keystorePropertiesFile.exists()
            if (keystoreAvailable) {
                signingConfig = signingConfigs.getByName("release")
            }
        }
        debug {
            isDebuggable = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.4")
    implementation("androidx.activity:activity-compose:1.9.1")

    implementation(platform("androidx.compose:compose-bom:2024.06.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.4")
    implementation("com.google.android.material:material:1.12.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")

    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}
