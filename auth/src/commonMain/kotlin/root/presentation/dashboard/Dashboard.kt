package root.presentation.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import fitwise.auth.generated.resources.Res
import fitwise.auth.generated.resources.finwise_logo
import io.github.kotlin.fibonacci.root.domain.AuthNav
import io.github.kotlin.fibonacci.root.presentation.dashboard.style.DashboardStyle
import org.jetbrains.compose.resources.painterResource
import presentation.composables.FwButton

@Composable
fun Dashboard(
    navController: NavController
) {
    Column(
        modifier = Modifier.background(color = DashboardStyle.containerColor()).fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(Res.drawable.finwise_logo),
                    contentDescription = "finwise_logo",
                    tint = DashboardStyle.iconColor()
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "FinWise",
                    style = TextStyle(
                        fontSize = 52.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = DashboardStyle.headerColor()
                    )
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur\nadipiscing elit, sed do eiusmod.",
                    style = TextStyle(
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center,
                        color = DashboardStyle.descriptionColor()
                    )
                )
                Spacer(modifier = Modifier.height(25.dp))

                FwButton(
                    modifier = Modifier.defaultMinSize(minWidth = 200.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = DashboardStyle.loginButtonContainerColor(),
                        contentColor = DashboardStyle.loginButtonContentColor()
                    ),
                    onClick = {
                        navController.navigate(route = AuthNav.Login.route) {
                            launchSingleTop = true
                        }
                    }
                ) {
                    Text(
                        text = "Log In",
                        style = TextStyle(
                            fontSize = 20.sp,
                            lineHeight = 22.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                FwButton(
                    modifier = Modifier.defaultMinSize(minWidth = 200.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = DashboardStyle.signUpButtonContainerColor(),
                        contentColor = DashboardStyle.signUpButtonContentColor()
                    ),
                    onClick = {
                        navController.navigate(route = AuthNav.SignUp.route) {
                            launchSingleTop = true
                        }
                    }
                ) {
                    Text(
                        text = "Sign Up",
                        style = TextStyle(
                            fontSize = 20.sp,
                            lineHeight = 22.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    modifier = Modifier.clickable {
                        navController.navigate(route = AuthNav.SignUp.route) {
                            launchSingleTop = true
                        }
                    },
                    text = "Forgot Password?",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = DashboardStyle.forgotPasswordTextColor()
                    )
                )

            }
        }
    }
}