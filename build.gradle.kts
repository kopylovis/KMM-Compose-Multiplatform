buildscript {
    repositories {
        gradlePluginPortal()
    }

    dependencies {
        classpath(ProjectDependencies.Moko.Resources.plugin)
    }
}
plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version(ProjectDependencies.gradle_version).apply(false)
    id("com.android.library").version(ProjectDependencies.gradle_version).apply(false)
    kotlin("android").version(ProjectDependencies.kotlin_version).apply(false)
    kotlin("multiplatform").version(ProjectDependencies.kotlin_version).apply(false)
    id("org.jetbrains.compose").version(ProjectDependencies.compose_plugin_version).apply(false)
    id("app.cash.sqldelight").version(ProjectDependencies.SQLDelite.version).apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
