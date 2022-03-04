package com.example.mcmoviecompose.navigation

import com.example.mcmoviecompose.util.Constants.DETAILS_ARGUMENT_KEY

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object Details : Screen("detail_screen/{$DETAILS_ARGUMENT_KEY}") {
        fun passId(id: String): String {
            return "detail_screen/$id"
        }
    }

    object More : Screen("more_screen")
}