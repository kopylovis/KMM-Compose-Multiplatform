package com.kopylovis.kmmcomposemuliplatformexample.core.theme

import androidx.compose.runtime.Composable

@Composable
expect fun AppTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean, //Supports only android API level > than 31. iOS should ignore this flag
    content: @Composable () -> Unit
)