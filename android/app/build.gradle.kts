android {
    namespace "com.iqra.iqra_islamic_wisdom"  // اپنا package name
    compileSdkVersion 33

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = '1.8'
    }

    sourceSets {
        main.java.srcDirs += 'src/main/kotlin'
    }

    defaultConfig {
        applicationId "com.iqra.iqra_islamic_wisdom"  // اپنا package name
        minSdkVersion 21
        targetSdkVersion 33
        versionCode 1
        versionName "3.3.0"
    }

    buildTypes {
        release {
            signingConfig signingConfigs.debug
        }
    }
}
