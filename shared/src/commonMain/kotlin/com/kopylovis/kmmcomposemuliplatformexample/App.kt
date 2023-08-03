package com.kopylovis.kmmcomposemuliplatformexample

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.kopylovis.kmmcomposemuliplatformexample.core.theme.AppTheme
import com.kopylovis.kmmcomposemuliplatformexample.presentation.tabs.AuthenticatorTab
import com.kopylovis.kmmcomposemuliplatformexample.presentation.tabs.PasswordsTab

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean
) {
    AppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        TabNavigator(tab = AuthenticatorTab) {
            Scaffold(
                content = {
                    CurrentTab()
                },
                bottomBar = {
                    NavigationBar {
                        TabNavigationItem(tab = AuthenticatorTab)
                        TabNavigationItem(tab = PasswordsTab)
                    }
                }
            )
        }
    }
}

@Composable
private fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current
    NavigationBarItem(
        label = {
            Text(text = tab.options.title)
        },
        selected = tabNavigator.current.key == tab.key,
        onClick = { tabNavigator.current = tab },
        icon = {
            tab.options.icon?.let {
                Icon(painter = it, contentDescription = tab.options.title)
            }
        }
    )
}