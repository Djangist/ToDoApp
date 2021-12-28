package com.example.todoapp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.todoapp.android.ui.MainScreen
import com.example.todoapp.android.theme.ComposeAppArchitectureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppArchitectureTheme {
                MainScreen()
            }
        }
    }
}
