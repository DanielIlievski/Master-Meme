package com.example.mastermeme.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme()

private val CustomDarkColorScheme = CustomColorScheme(
    surfaceContainerLowest = DarkSurfaceContainerLowest,
    surfaceContainerLow = SurfaceContainerLow,
    surfaceContainer = SurfaceContainer,
    surfaceContainerHigh = DarkSurfaceContainerHigh,
    schemesOutline = SchemesOutline,
    primary = Primary,
    secondary = Secondary,
    onSurface = DarkOnSurface,
    primaryContainer = PrimaryContainer,
    schemesError = SchemesError,
    onPrimaryFixed = OnPrimaryFixed,
    gradientPurpleLight1 = PurpleLight1,
    gradientPurpleMedium1 = PurpleMedium1,
    gradientPurpleLight2 = PurpleLight2,
    gradientPurpleMedium2 = PurpleMedium2,
    white = White,
    black = Black
)

private val LightColorScheme = lightColorScheme()

private val CustomLightColorScheme = CustomColorScheme(
    surfaceContainerLow = SurfaceContainerLow,
    surfaceContainer = SurfaceContainer,
    surfaceContainerHigh = LightSurfaceContainerHigh,
    schemesOutline = SchemesOutline,
    primary = Primary,
    secondary = Secondary,
    onSurface = DarkOnSurface,
    primaryContainer = PrimaryContainer,
    schemesError = SchemesError,
    onPrimaryFixed = OnPrimaryFixed,
    gradientPurpleMedium1 = PurpleMedium1,
    gradientPurpleLight2 = PurpleLight2,
    gradientPurpleMedium2 = PurpleMedium2,
    white = White,
    black = Black
)

@Composable
fun MasterMemeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val customColorScheme = if (darkTheme) CustomDarkColorScheme else CustomLightColorScheme

    CompositionLocalProvider(
        LocalCustomColorScheme provides customColorScheme
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}
