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

    object Voyager {
        private const val version = "1.0.0-rc05"
        const val navigator = "cafe.adriel.voyager:voyager-navigator:$version"
        const val bottom_sheet_navigator = "cafe.adriel.voyager:voyager-bottom-sheet-navigator:$version"
        const val tab_navigator = "cafe.adriel.voyager:voyager-tab-navigator:$version"
        const val transitions = "cafe.adriel.voyager:voyager-transitions:$version"
        const val koin_navigator = "cafe.adriel.voyager:voyager-koin:$version"
        val list = listOf(
            navigator, bottom_sheet_navigator, tab_navigator, transitions, koin_navigator
        )
    }

    object Moko {

        object MVVM {
            private const val version = "0.16.1"
            const val core = "dev.icerock.moko:mvvm-core:$version"
            const val compose = "dev.icerock.moko:mvvm-compose:$version"
            const val flow = "dev.icerock.moko:mvvm-flow:$version"
            const val flow_compose = "dev.icerock.moko:mvvm-flow-compose:$version"
            val list = listOf(
                core, compose, flow, flow_compose
            )
        }

        object Resources {
            private const val version = "0.23.0"
            const val plugin = "dev.icerock.moko:resources-generator:$version"
            const val resources = "dev.icerock.moko:resources:$version"
            const val resources_compose = "dev.icerock.moko:resources-compose:$version"
            val list = listOf(
                resources, resources_compose
            )
        }
    }

    object Koin {
        private const val version = "3.4.2"
        const val core = "io.insert-koin:koin-core:$version"
    }

    object SQLDelite {
        const val version = "2.0.0"
        const val runtime = "app.cash.sqldelight:runtime:$version"
        const val coroutines_extensions = "app.cash.sqldelight:coroutines-extensions:$version"
        const val driver_android = "app.cash.sqldelight:android-driver:$version"
        const val driver_native = "app.cash.sqldelight:native-driver:$version" //for iOS, Windows, etc
    }

}