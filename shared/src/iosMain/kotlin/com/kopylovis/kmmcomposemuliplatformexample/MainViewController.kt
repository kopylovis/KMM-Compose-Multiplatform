package com.kopylovis.kmmcomposemuliplatformexample

import androidx.compose.ui.window.ComposeUIViewController
import org.jetbrains.skiko.SystemTheme
import org.jetbrains.skiko.currentSystemTheme

fun mainViewController() = ComposeUIViewController {
    App(
        darkTheme = currentSystemTheme == SystemTheme.DARK,
        dynamicColor = false
    )
}