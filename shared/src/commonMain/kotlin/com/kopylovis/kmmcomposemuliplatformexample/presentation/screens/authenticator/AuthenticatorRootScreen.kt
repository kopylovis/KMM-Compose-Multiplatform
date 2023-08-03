package com.kopylovis.kmmcomposemuliplatformexample.presentation.screens.authenticator

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.bottomSheet.BottomSheetNavigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.screens.contactlist.ContactListScreen

@OptIn(ExperimentalAnimationApi::class, ExperimentalMaterialApi::class)
@Composable
fun AuthenticatorRootScreen() {

    BottomSheetNavigator {
        Navigator(screen = ContactListScreen) { navigator ->
            SlideTransition(navigator)
        }
    }
}