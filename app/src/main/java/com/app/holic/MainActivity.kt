package com.app.holic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.app.holic.ui.screen.dashboard.Dashboard
import com.app.holic.ui.theme.HolicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HolicTheme {
                Dashboard()
            }
        }
    }
}
