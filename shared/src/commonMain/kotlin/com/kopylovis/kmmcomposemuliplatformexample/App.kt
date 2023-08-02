package com.kopylovis.kmmcomposemuliplatformexample

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.bottomSheet.BottomSheetNavigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.kopylovis.kmmcomposemuliplatformexample.contacts.presentation.screens.contactlist.ContactListScreen
import com.kopylovis.kmmcomposemuliplatformexample.core.theme.AppTheme

@OptIn(ExperimentalMaterialApi::class, ExperimentalAnimationApi::class)
@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean
) {
    AppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        BottomSheetNavigator {
            Navigator(screen = ContactListScreen) { navigator ->
                SlideTransition(navigator = navigator)
            }
        }
    }
}