package io.github.kotlin.fibonacci.root.presentation.dashboard.style

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import presentation.Green2
import presentation.Green3
import presentation.Green4
import presentation.Green5
import presentation.Green6
import presentation.Green7

object DashboardStyle {

    @Composable
    fun containerColor(): Color = if (isSystemInDarkTheme()) Green2 else Green7

    @Composable
    fun iconColor(): Color = if (isSystemInDarkTheme()) Green5 else Green5

    @Composable
    fun headerColor(): Color = if (isSystemInDarkTheme()) Green5 else Green5

    @Composable
    fun descriptionColor(): Color = if (isSystemInDarkTheme()) Green6 else Color(0xFF4B4544)

    @Composable
    fun loginButtonContainerColor(): Color = if (isSystemInDarkTheme()) Green5 else Green5

    @Composable
    fun loginButtonContentColor(): Color = if (isSystemInDarkTheme()) Green3 else Green3


    @Composable
    fun signUpButtonContainerColor(): Color = if (isSystemInDarkTheme()) Green6 else Green6

    @Composable
    fun signUpButtonContentColor(): Color = if (isSystemInDarkTheme()) Green4 else Green4

    @Composable
    fun forgotPasswordTextColor(): Color = if (isSystemInDarkTheme()) Green6 else Green3
}