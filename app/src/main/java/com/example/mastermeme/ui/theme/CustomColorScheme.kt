package com.example.mastermeme.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class CustomColorScheme(
    val surfaceContainerLowest: Color = Color.Unspecified,
    val surfaceContainerLow: Color = Color.Unspecified,
    val surfaceContainer: Color = Color.Unspecified,
    val surfaceContainerHigh: Color = Color.Unspecified,
    val schemesOutline: Color = Color.Unspecified,
    val primary: Color = Color.Unspecified,
    val secondary: Color = Color.Unspecified,
    val onSurface: Color = Color.Unspecified,
    val primaryContainer: Color = Color.Unspecified,
    val schemesError: Color = Color.Unspecified,
    val onPrimaryFixed: Color = Color.Unspecified,
    val gradientPurpleLight1: Color = Color.Unspecified,
    val gradientPurpleMedium1: Color = Color.Unspecified,
    val gradientPurpleLight2: Color = Color.Unspecified,
    val gradientPurpleMedium2: Color = Color.Unspecified,
    val white: Color = Color.Unspecified,
    val black: Color = Color.Unspecified,
)

val LocalCustomColorScheme = staticCompositionLocalOf { CustomColorScheme() }
