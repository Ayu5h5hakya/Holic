package com.app.holic.ui.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun HolicGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Route.HOME) {
        composable(Route.HOME) {
            Text("home")
        }
        composable(Route.CATEGORIES) {
            Text("categories")
        }
        composable(Route.DEALS) {
            Text("deals")
        }
        composable(Route.SETTINGS) {
            Text("settings")
        }
    }
}

object Route {
    const val HOME = "home"
    const val CATEGORIES = "categories"
    const val DEALS = "deals_offers"
    const val SETTINGS = "settings"
}