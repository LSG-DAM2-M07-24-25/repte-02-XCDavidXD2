package com.example.repte_02.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.repte_02.Model.Nombre
import com.example.repte_02.R
import com.example.repte_02.Routes
import androidx.compose.runtime.livedata.observeAsState
import com.example.repte_02.ViewModel.NombreViewModel

@Composable
fun Screen3(viewModel: NombreViewModel, navController: NavHostController, imagen: Int){
    val nombre by viewModel.nombre.observeAsState(initial = Nombre("David"))
    var selectedText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.dragonball_daima_logo),
            contentDescription = "logo dragon ball daima",
            modifier = Modifier
                .size(250.dp)
                .align(Alignment.CenterHorizontally)
        )

        OutlinedTextField(
            value = selectedText,
            onValueChange = {
                selectedText = it
                viewModel.cambioNombre(selectedText)
                            },
            textStyle = TextStyle(color = Color.Black),
            placeholder = { Text(text = "Nom del personatge", fontFamily = FontFamily.Serif) },
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Green,
                disabledTextColor = Color.DarkGray,
                cursorColor = Color.Yellow ),

        )
        
        Spacer(modifier = Modifier.size(30.dp))

        Button(
            onClick = {
                navController.navigate(Routes.Pantalla4.createRoute(imagen,selectedText))
            },shape = RoundedCornerShape(8.dp),
            enabled = selectedText.isNotEmpty()
        ) {
            Text(
                text = "Mostrar",
                fontFamily = FontFamily.Serif,
                fontSize = 24.sp
            )
        }
    }
}