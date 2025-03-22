package io.github.kotlin.fibonacci.root.domain

sealed class AuthNav(val route: String) {
    data object Dashboard : AuthNav(route = "dashboard")
    data object Login : AuthNav(route = "login")
    data object SignUp : AuthNav(route = "signup")
    data object ForgotPassword : AuthNav(route = "forgot_password")
}