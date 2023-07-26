package com.kopylovis.kmmcomposemuliplatformexample.core.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap

@Composable
expect fun rememberBitmapsFromBytes(bytes: ByteArray?): ImageBitmap?