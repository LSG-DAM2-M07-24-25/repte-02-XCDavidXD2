package com.example.repte_02.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.repte_02.Model.Nombre
import com.example.repte_02.R
import com.example.repte_02.Routes

@Composable
fun Screen4(navController: NavHostController, imagen: Int, nombre: String){
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

        Image(
            painter = painterResource(
                id = when (imagen) {
                    1 -> R.drawable.gomah
                    2 -> R.drawable.goku
                    3 -> R.drawable.vegeta
                    4 -> R.drawable.piccolo
                    5 -> R.drawable.supreme
                    6 -> R.drawable.masked_majin
                    else -> R.drawable.goku
                }
            ),
            contentDescription = "Personajes",
            modifier = Modifier
                .size(250.dp)
                .align(Alignment.CenterHorizontally)
        )

        Text(text = nombre,
            fontFamily = FontFamily.Serif,
            fontSize = 24.sp)

        Button(
            onClick = {
                navController.navigate(Routes.Pantalla2.route)
            },shape = RoundedCornerShape(8.dp),
        ) {
            Text(
                text = "Tornar",
                fontFamily = FontFamily.Serif,
                fontSize = 24.sp
            )
        }

    }
}