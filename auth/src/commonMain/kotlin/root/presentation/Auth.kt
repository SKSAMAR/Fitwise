package io.github.kotlin.fibonacci.root.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.kotlin.fibonacci.root.domain.AuthNav

@Composable
fun Auth() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AuthNav.Dashboard.route) {
        composable(route = AuthNav.Dashboard.route) { }
        composable(route = AuthNav.Login.route) { }
        composable(route = AuthNav.SignUp.route) { }
        composable(route = AuthNav.ForgotPassword.route) { }
    }
}