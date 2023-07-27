object ProjectDependencies {

    const val kotlin_version = "1.8.22"
    const val kotlin_compiler_extension_version = "1.4.8" //https://developer.android.com/jetpack/androidx/releases/compose-kotlin#declaring_dependencies
    const val gradle_version = "8.0.0"
    const val compose_plugin_version = "1.4.3"

    object JetBrains {
        const val atomicfu = "org.jetbrains.kotlinx:atomicfu:0.21.0"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.6.1"
        const val activity_compose = "androidx.activity:activity-compose:1.7.2"
    }

    object Moko {
        private const val version = "0.16.1"
        const val core = "dev.icerock.moko:mvvm-core:$version"
        const val compose = "dev.icerock.moko:mvvm-compose:$version"
        const val flow = "dev.icerock.moko:mvvm-flow:$version"
        const val flow_compose = "dev.icerock.moko:mvvm-flow-compose:$version"
        val list = listOf(
            core, compose, flow, flow_compose
        )
    }

    object Koin {
        private const val version = "3.4.2"
        const val core = "io.insert-koin:koin-core:$version"
    }
}