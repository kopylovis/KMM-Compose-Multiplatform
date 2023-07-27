package com.kopylovis.kmmcomposemuliplatformexample

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.screens.contactlist.ContactListScreen
import com.kopylovis.kmmcomposemuliplatformexample.core.presentation.provideContactViewModel
import com.kopylovis.kmmcomposemuliplatformexample.core.theme.AppTheme

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean
) {
    AppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        val viewModel = provideContactViewModel(key = "contacts-view-model")
        val state by viewModel.state.collectAsState()
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ContactListScreen(
                state = state,
                newContact = viewModel.newContact,
                onEvent = viewModel::obtainEvent
            )
        }
    }
}