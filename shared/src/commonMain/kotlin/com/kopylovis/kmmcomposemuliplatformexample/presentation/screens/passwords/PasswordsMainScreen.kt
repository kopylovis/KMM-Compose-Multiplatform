package com.kopylovis.kmmcomposemuliplatformexample.presentation.screens.passwords

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.kopylovis.kmmcomposemultiplatformexample.MR
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun PasswordsMainScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize().background(Color.Yellow),
        contentAlignment = Alignment.Center
    ) {
        Text(text = stringResource(resource = MR.strings.passwords_tab))
    }
}