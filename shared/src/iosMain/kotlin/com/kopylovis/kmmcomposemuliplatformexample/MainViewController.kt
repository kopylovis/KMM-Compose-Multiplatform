package com.kopylovis.kmmcomposemuliplatformexample

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

fun mainViewController() = ComposeUIViewController {
    App(
        darkTheme = UIScreen.mainScreen.traitCollection.userInterfaceStyle ==
                UIUserInterfaceStyle.UIUserInterfaceStyleDark,
        dynamicColor = false
    )
}