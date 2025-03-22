package sk.samar.fitwise

import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.FitWiseTheme
import sk.samar.fitwise.presentation.Root

@Composable
@Preview
fun App() {
    FitWiseTheme {
        Root()
    }
}