package com.example.cleanarchitectureapp.features.notesFeature.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cleanarchitectureapp.ui.theme.CleanArchitectureAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanArchitectureAppTheme {

            }
        }
    }
}
