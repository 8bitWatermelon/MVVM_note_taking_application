package com.example.cleanarchitectureapp.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.White

private val DarkColorPalette = darkColors(
    primary = White,
    background = DarkGray,
    onBackground = White,
    surface = LightBlue,
    onSurface = DarkGray
)

@Composable
fun CleanArchitectureAppTheme(darkTheme: Boolean = true, content: @Composable () -> Unit) {

    MaterialTheme(
        colors = DarkColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}