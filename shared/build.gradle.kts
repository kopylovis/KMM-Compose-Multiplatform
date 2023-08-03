plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
    id("dev.icerock.mobile.multiplatform-resources")
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "17"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.material3)
                implementation(compose.materialIconsExtended)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)
                implementation(ProjectDependencies.JetBrains.atomicfu)
                implementation(ProjectDependencies.Koin.core)
                ProjectDependencies.Moko.MVVM.list.forEach { mokoDep ->
                    implementation(mokoDep)
                }
                ProjectDependencies.Moko.Resources.list.forEach { mokoDep ->
                    implementation(mokoDep)
                }
                ProjectDependencies.Voyager.list.forEach { voyagerDep ->
                    implementation(voyagerDep)
                }
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(ProjectDependencies.AndroidX.appcompat)
                implementation(ProjectDependencies.AndroidX.activity_compose)
            }
        }
        val iosMain by getting {
            dependencies {
            }
            dependsOn(commonMain)
        }
    }
}

android {
    namespace = "com.kopylovis.kmmcomposemultiplatformexample"
    compileSdk = 33
    defaultConfig {
        minSdk = 28
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

multiplatformResources {
    multiplatformResourcesPackage = "com.kopylovis.kmmcomposemultiplatformexample"
}