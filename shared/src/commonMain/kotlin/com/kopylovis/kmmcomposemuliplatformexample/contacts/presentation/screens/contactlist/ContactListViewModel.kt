package com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.screens.contactlist

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.kopylovis.kmmcomposemuliplatformexample.contacts.domain.Contact
import com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.contacts.ContactUIEvent
import com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.contacts.ContactUIState
import com.kopylovis.kmmcomposemuliplatformexample.utils.PlatformTestUtils
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ContactListViewModel(
    private val platformTestUtils: PlatformTestUtils
): ViewModel() {

    private val contacts = (1..50).map {
        Contact(
            id = it.toLong(),
            firstName = "First$it",
            lastName = platformTestUtils.name,
            email = "test$it@gmail.com",
            phoneNumber = "123456789",
            photoBytes = null
        )
    }

    private val _state = MutableStateFlow(ContactUIState(
        contacts = contacts
    ))
    val state = _state.asStateFlow()

    fun obtainEvent(event: ContactUIEvent) {

    }
}