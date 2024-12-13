package com.example.repte_02.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.example.repte_02.R
import com.example.repte_02.Routes

@Composable
fun Screen2(navController: NavHostController){

    var imagen by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.dragonball_daima_logo),
            contentDescription = "logo dragon ball daima",
            modifier = Modifier
                .size(300.dp)
                .align(Alignment.CenterHorizontally)
        )
        Box(
            modifier = Modifier
                .weight(0.4f)
                .align(Alignment.CenterHorizontally),
            contentAlignment = Center
        ){
            ConstraintLayout {
                val primeraLinea = createGuidelineFromTop(0.0f)
                val segundaLinea = createGuidelineFromTop(0.5f)

                val (a, b, c) = createRefs()
                val (d, e, f) = createRefs()

                TextButton(onClick = {
                    imagen = 1
                }, modifier = Modifier
                    .size(150.dp)
                    .constrainAs(a){
                        top.linkTo(primeraLinea)
                    }
                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.gomah),
                        contentDescription = "logo dragon ball daima",
                    )
                }

                TextButton(onClick = {
                    imagen = 2
                }, modifier = Modifier
                    .size(150.dp)
                    .constrainAs(b){
                        top.linkTo(primeraLinea)
                        start.linkTo(a.end)
                    }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.goku),
                        contentDescription = "logo dragon ball daima",
                    )
                }

                TextButton(onClick = {
                    imagen = 3
                }, modifier = Modifier
                    .size(150.dp)
                    .constrainAs(c){
                        top.linkTo(primeraLinea)
                        start.linkTo(b.end)
                    }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.vegeta),
                        contentDescription = "logo dragon ball daima",
                    )
                }

                TextButton(onClick = {
                    imagen = 4
                }, modifier = Modifier
                    .size(150.dp)
                    .constrainAs(d){
                        top.linkTo(segundaLinea)
                    }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.piccolo),
                        contentDescription = "logo dragon ball daima",
                    )
                }

                TextButton(onClick = {
                    imagen = 5
                }, modifier = Modifier
                    .size(150.dp)
                    .constrainAs(e){
                        top.linkTo(segundaLinea)
                        start.linkTo(d.end)
                    }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.supreme),
                        contentDescription = "logo dragon ball daima",
                    )
                }

                TextButton(onClick = {
                    imagen = 6
                }, modifier = Modifier
                    .size(150.dp)
                    .constrainAs(f){
                        top.linkTo(segundaLinea)
                        start.linkTo(e.end)
                    }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.masked_majin),
                        contentDescription = "logo dragon ball daima",
                    )
                }
            }
        }
        Button(
            onClick = {
                navController.navigate(Routes.Pantalla3.createRoute(imagen))
            },shape = RoundedCornerShape(8.dp),
            enabled = imagen > 0,
            modifier = Modifier
                .padding(16.dp)
                .height(50.dp)
                .width(200.dp)
        ) {
            Text(
                text = "Continuar",
                fontFamily = FontFamily.Serif,
                fontSize = 24.sp
            )
        }
    }
}