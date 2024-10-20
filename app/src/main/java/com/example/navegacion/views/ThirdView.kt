package com.example.navegacion.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.navegacion.components.MainButton
import com.example.navegacion.components.TitleBar
import com.example.navegacion.components.TitleView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirdView(navController: NavController, opcional:String?) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { TitleBar(name = "Third View") },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Green
                )
            )
        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TitleView(name = "Third View")
            Text(text = "Parametro enviado: $opcional")
            MainButton(name = "Home View", backColor = Color.Red, color = Color.White) {
                navController.navigate("Home") {
                    // pa limpiar la pila e ir home
                    popUpTo("Home") { inclusive = true }
                }
            }
        }
    }
}

