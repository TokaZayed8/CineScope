package com.example.cinescope.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

private val DarkColors = darkColors(
    primary = PurplePrimary,
    primaryVariant = PurpleVariant,
    secondary = Accent,
    background = BgLight,
    surface = SurfaceDark,
    onPrimary = OnPrimary
)

@Composable
fun CineScopeTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = DarkColors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
