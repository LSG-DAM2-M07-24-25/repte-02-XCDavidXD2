package com.example.repte_02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import com.example.repte_02.View.EntryPoint
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.activity.viewModels
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.repte_02.ViewModel.NombreViewModel
import com.example.repte_02.ui.theme.Repte_02Theme

class MainActivity : ComponentActivity() {

    val nombreController:NombreViewModel by viewModels<NombreViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Repte_02Theme {
                Surface (
                    color = MaterialTheme.colorScheme.background
                ){
                    val navigationController = rememberNavController()
                    EntryPoint(navigationController, nombreController)
                }
            }
        }
    }
}