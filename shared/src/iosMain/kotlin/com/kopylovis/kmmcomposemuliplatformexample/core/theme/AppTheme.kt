package com.kopylovis.kmmcomposemuliplatformexample.core.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.kopylovis.kmmcomposemuliplatformexample.core.theme.ui.DarkColorScheme
import com.kopylovis.kmmcomposemuliplatformexample.core.theme.ui.LightColorScheme
import com.kopylovis.kmmcomposemuliplatformexample.core.theme.ui.Typography

@Composable
actual fun AppTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}