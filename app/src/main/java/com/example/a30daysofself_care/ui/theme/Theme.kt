// app/src/main/java/com/example/a30daysofself_care/ui/theme/Theme.kt
package com.example.a30daysofself_care.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.Color

// 💖 GIRLY LIGHT COLOR SCHEME — NO BLUE, NO GREEN
private val LightColorScheme = lightColorScheme(
    primary = Color(0xFFFF6B9D),     // Rose pink
    secondary = Color(0xFFFF9EAC),   // Blush pink
    tertiary = Color(0xFFFFD166),    // Warm gold
    background = Color(0xFFFFFBFF),  // Soft off-white (warm, not cold white)
    surface = Color(0xFFFFF8F9),     // Very light rose
    onPrimary = Color(0xFFFFFFFF),
    onSecondary = Color(0xFFFFFFFF),
    onTertiary = Color(0xFF000000),
    onBackground = Color(0xFF2B1B28), // Deep rose-gray (softer than black)
    onSurface = Color(0xFF2B1B28)
)

// 🌙 Optional dark theme (girly version)
private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFFF6B9D),
    secondary = Color(0xFFFF9EAC),
    tertiary = Color(0xFFFFD166),
    background = Color(0xFF1D0F1A),
    surface = Color(0xFF251522),
    onPrimary = Color(0xFFFFFFFF),
    onSecondary = Color(0xFFFFFFFF),
    onTertiary = Color(0xFF000000),
    onBackground = Color(0xFFEDE0E0),
    onSurface = Color(0xFFEDE0E0)
)

@Composable
fun _30DaysOfSelfCareTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
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

    MaterialTheme(
        colorScheme = colorScheme,
        typography = MaterialTheme.typography, // Use default Material 3 typography (elegant!)
        content = content
    )
}