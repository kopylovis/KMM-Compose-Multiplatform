package com.kopylovis.kmmcomposemuliplatformexample.presentation.tabs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Key
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.kopylovis.kmmcomposemuliplatformexample.presentation.screens.authenticator.AuthenticatorRootScreen
import com.kopylovis.kmmcomposemultiplatformexample.MR
import dev.icerock.moko.resources.compose.stringResource

internal object AuthenticatorTab: Tab {

    override val options: TabOptions

        @Composable
        get() {
            val title = stringResource(resource = MR.strings.authenticator_tab)
            val icon = rememberVectorPainter(Icons.Default.Key)

            return remember {
                TabOptions(
                    index = 0u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        AuthenticatorRootScreen()
    }
}