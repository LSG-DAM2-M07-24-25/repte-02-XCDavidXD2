package com.example.repte_02

import com.example.repte_02.Model.Nombre

sealed class Routes (val route: String){
    object Pantalla1 : Routes("pantalla1")
    object Pantalla2 : Routes("pantalla2")
    object Pantalla3 : Routes("pantalla3/{imagen}"){
        fun createRoute(imagen: Int) = "pantalla3/$imagen"
    }
    object Pantalla4 : Routes("pantalla4/{imagen}/{nombre}"){
        fun createRoute(imagen: Int, nombre: String) = "pantalla4/$imagen/$nombre"
    }
}