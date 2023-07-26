package com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.kopylovis.kmmcomposemuliplatformexample.contacts.domain.Contact

@Composable
fun ContactListItem(
    contact: Contact,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ContactPhoto(
            contact = contact,
            modifier = Modifier.size(50.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = "${contact.firstName} ${contact.lastName}",
            modifier = Modifier.weight(weight = 1F),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }

}