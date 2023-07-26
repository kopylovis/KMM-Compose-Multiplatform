package com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.contacts

import com.kopylovis.kmmcomposemuliplatformexample.contacts.domain.Contact

data class ContactUIState(
    val contacts: List<Contact> = emptyList(),
    val recentlyAddedContacts: List<Contact> = emptyList(),
    val selectedContact: Contact? = null,
    val isAddContactSheetOpen: Boolean = false,
    val isSelectedContactSheetOpen: Boolean = false,
    val firstNameError: String? = null,
    val lastNameError: String? = null,
    val emailError: String? = null,
    val phoneNumberError: String? = null
)