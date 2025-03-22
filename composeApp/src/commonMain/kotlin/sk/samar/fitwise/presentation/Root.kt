package sk.samar.fitwise.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.github.kotlin.fibonacci.root.presentation.Auth
import presentation.LocalNavHostController
import sk.samar.fitwise.domain.nav.AppNav

@Composable
fun Root() {
    val navController = LocalNavHostController.current
    NavHost(navController = navController, startDestination = AppNav.Auth.route){
        composable(route = AppNav.Auth.route){
            Auth()
        }
        composable(route = AppNav.Dashboard.route){

        }
    }
}