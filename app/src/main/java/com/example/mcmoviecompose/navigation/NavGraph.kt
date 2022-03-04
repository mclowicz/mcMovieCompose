package com.example.mcmoviecompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.mcmoviecompose.presentation.screens.home.HomeScreen
import com.example.mcmoviecompose.util.Constants.DETAILS_ARGUMENT_KEY
import com.example.mcmoviecompose.util.Constants.MORE_ARGUMENT_KEY
import kotlinx.coroutines.InternalCoroutinesApi

@InternalCoroutinesApi
@Composable
fun SetupNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(navHostController = navHostController)
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(navArgument(DETAILS_ARGUMENT_KEY) {
                type = NavType.IntType
            })
        ) {

        }
        composable(
            route = Screen.More.route,
            arguments = listOf(navArgument(MORE_ARGUMENT_KEY) {
                type = NavType.StringType
            })
        ) {

        }
    }
}