package com.kopylovis.kmmcomposemuliplatformexample.core.presentation

import androidx.compose.runtime.Composable
import com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.screens.contactlist.ContactListViewModel
import com.kopylovis.kmmcomposemuliplatformexample.utils.PlatformTestUtils
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

object ViewModelFactory: KoinComponent {

    @Composable
    fun provideContactViewModel(key: String): ContactListViewModel {
        val platformTestUtils by inject<PlatformTestUtils>()
        return getViewModel(
            key = key,
            factory = viewModelFactory {
                ContactListViewModel(
                    platformTestUtils = platformTestUtils
                )
            }
        )
    }
}
