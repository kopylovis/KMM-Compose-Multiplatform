package com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.contacts

import com.kopylovis.kmmcomposemuliplatformexample.contacts.domain.Contact

sealed interface ContactUIEvent {
    object OnAddNewContactClicked: ContactUIEvent
    object DismissContact: ContactUIEvent
    data class OnFirstNameChanged(val value: String): ContactUIEvent
    data class OnLastNameChanged(val value: String): ContactUIEvent
    data class OnEmailChanged(val value: String): ContactUIEvent
    data class OnPhoneNumberChanged(val value: String): ContactUIEvent
    class OnPhotoClicked(val bytes: ByteArray): ContactUIEvent
    object OnAddPhotoClicked: ContactUIEvent
    object SaveContact: ContactUIEvent
    data class SelectContact(val contact: Contact): ContactUIEvent
    data class EditContact(val contact: Contact): ContactUIEvent
    object DeleteContact
}