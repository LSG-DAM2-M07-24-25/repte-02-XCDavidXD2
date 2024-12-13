package com.example.repte_02.View

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.repte_02.Routes
import com.example.repte_02.View.Screen1
import com.example.repte_02.View.Screen2
import com.example.repte_02.View.Screen3
import com.example.repte_02.View.Screen4
import com.example.repte_02.ViewModel.NombreViewModel

@Composable
fun EntryPoint(navigationController: NavHostController, nombreViewModel: NombreViewModel){
    NavHost(
        navController =navigationController,
        startDestination = Routes.Pantalla1.route
    ){
        composable(Routes.Pantalla1.route) { Screen1(navigationController) }
        composable(Routes.Pantalla2.route) { Screen2(navigationController) }

        composable(
            Routes.Pantalla3.route,
            arguments = listOf(
                navArgument("imagen") { type = NavType.IntType },
            )
        ) { backStackEntry ->
            Screen3(
                viewModel = nombreViewModel,
                navController = navigationController,
                imagen = backStackEntry.arguments?.getInt("imagen") ?: 0,
            )
        }

        composable(
            Routes.Pantalla4.route,
            arguments = listOf(
                navArgument("imagen") { type = NavType.IntType },
                navArgument("nombre") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            Screen4(
                navController = navigationController,
                imagen = backStackEntry.arguments?.getInt("imagen") ?: 0,
                nombre = backStackEntry.arguments?.getString("nombre").orEmpty()
            )
        }
    }
}
