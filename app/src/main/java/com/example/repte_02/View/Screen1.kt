package com.example.repte_02.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import com.example.repte_02.Routes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.repte_02.R

@Composable
fun Screen1(navController: NavHostController){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Box(
            modifier = Modifier
                .align(Alignment.Center)
        ){
            Column{
                Image(
                    painter = painterResource(id = R.drawable.dragonball_daima_logo),
                    contentDescription = "logo dragon ball daima",
                    modifier = Modifier
                        .size(450.dp)
                        .align(Alignment.CenterHorizontally)
                )
                OutlinedButton(
                    onClick = {
                        navController.navigate(Routes.Pantalla2.route)
                    },shape = RoundedCornerShape(8.dp),
                    modifier =Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(16.dp)
                        .height(50.dp)
                        .width(200.dp)
                ) {
                    Text(
                        text = "Entrar",
                        fontFamily = FontFamily.Serif,
                        fontSize = 24.sp
                    )
                }
            }
        }
    }
}