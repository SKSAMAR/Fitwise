package sk.samar.fitwise.domain.nav

sealed class AppNav(val route: String) {
    data object Auth : AppNav(route = "auth")
    data object Dashboard : AppNav(route = "dashboard")
}