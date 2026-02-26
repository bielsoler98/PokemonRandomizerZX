package com.dabomstew.pkrandomandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.dabomstew.pkrandomandroid.ui.navigation.AppNavigation
import com.dabomstew.pkrandomandroid.ui.theme.PokemonRandomizerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokemonRandomizerTheme {
                AppNavigation()
            }
        }
    }
}
