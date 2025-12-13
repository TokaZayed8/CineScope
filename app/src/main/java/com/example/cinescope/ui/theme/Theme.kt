package com.example.cinescope.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

private val DarkColorScheme: ColorScheme = darkColorScheme(
    primary = BluePrimary,
    secondary = Accent,
    background = BgLight,
    surface = SurfaceDark,
    onPrimary = OnPrimary
)

@Composable
fun CineScopeTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = androidx.compose.material3.Typography(), // defaults ok
        content = content
    )
}
