package com.kopylovis.kmmcomposemuliplatformexample.core.presentation

import androidx.compose.runtime.Composable
import com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.screens.contactlist.ContactListViewModel
import com.kopylovis.kmmcomposemuliplatformexample.di.ServiceLocator
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory

@Composable
fun provideContactViewModel(key: String): ContactListViewModel = getViewModel(
    key = key,
    factory = viewModelFactory {
        ContactListViewModel(
            platformTestUtils = ServiceLocator.platformUtils
        )
    }
)