package com.kopylovis.kmmcomposemuliplatformexample.presentation.tabs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Password
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.kopylovis.kmmcomposemuliplatformexample.presentation.screens.passwords.PasswordsMainScreen
import com.kopylovis.kmmcomposemultiplatformexample.MR
import dev.icerock.moko.resources.compose.stringResource

internal object PasswordsTab: Tab {

    override val options: TabOptions

        @Composable
        get() {
            val title = stringResource(resource = MR.strings.passwords_tab)
            val icon = rememberVectorPainter(Icons.Default.Password)

            return remember {
                TabOptions(
                    index = 1u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        PasswordsMainScreen()
    }
}