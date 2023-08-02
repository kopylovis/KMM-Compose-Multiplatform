package com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.screens.contactlist

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PersonAdd
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.bottomSheet.LocalBottomSheetNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.kopylovis.kmmcomposemuliplatformexample.contacts.domain.Contact
import com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.components.ContactListItem
import com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.contacts.ContactUIEvent
import com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.contacts.ContactUIState
import com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.screens.details.ContactDetailsScreen
import com.kopylovis.kmmcomposemuliplatformexample.core.presentation.provideContactViewModel
import com.kopylovis.kmmcomposemuliplatformexample.utils.TestUtils
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

object ContactListScreen: Screen, KoinComponent {

    @Composable
    override fun Content() {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val viewModel = provideContactViewModel(key = "contacts-view-model")
            val state by viewModel.state.collectAsState()
            val testUtils by inject<TestUtils>()
            ContactListScreen(
                state = state,
                newContact = viewModel.newContact,
                onEvent = viewModel::obtainEvent
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactListScreen(
    state: ContactUIState,
    newContact: Contact?,
    onEvent: (ContactUIEvent) -> Unit
) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                shape = RoundedCornerShape(20.dp),
                onClick = {
                    onEvent(ContactUIEvent.OnAddNewContactClicked)
                }
            ) {
                Icon(
                    imageVector = Icons.Rounded.PersonAdd,
                    contentDescription = "Add contact icon"
                )
            }
        }
    ) {
        val navigator = LocalNavigator.currentOrThrow
        val bottomSheetNavigator = LocalBottomSheetNavigator.current
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Text(
                    text = "My contacts (${state.contacts.size})",
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                    fontWeight = FontWeight.Bold
                )
            }
            items(items = state.contacts) { contact ->
                ContactListItem(
                    contact = contact,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .clickable {
//                            onEvent(ContactUIEvent.SelectContact(contact = contact))
                            val testScreen = ContactDetailsScreen(id = contact.id?.toInt() ?: -1)
                            bottomSheetNavigator.show(screen = testScreen)
//                            navigator.push(item = testScreen)
                        }
                )
            }
        }
    }
}