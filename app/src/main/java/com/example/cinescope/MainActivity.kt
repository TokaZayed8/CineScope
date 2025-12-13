package com.example.cinescope
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cinescope.ui.theme.CineScopeTheme
import com.example.cinescope.ui.navigation.CineNavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CineScopeTheme {
                CineNavGraph()

            }
        }
    }
}


