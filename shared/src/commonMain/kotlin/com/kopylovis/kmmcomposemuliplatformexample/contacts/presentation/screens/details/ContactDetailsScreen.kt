package com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.screens.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.core.screen.Screen
import com.kopylovis.kmmcomposemultiplatformexample.MR
import dev.icerock.moko.resources.compose.stringResource
import org.koin.core.component.KoinComponent

data class ContactDetailsScreen(val id: Int) : Screen, KoinComponent {

    @Composable
    override fun Content() {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.Red),
            contentAlignment = Alignment.Center
        ) {
            val sd = stringResource(resource = MR.strings.my_string)
            Text(
                text = "$sd\nContact position: $id"
            )
        }
    }

}