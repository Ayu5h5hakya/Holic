package com.app.holic.ui.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun HolicGraph(navController: NavHostController) {
    NavHost(navController, startDestination = RouteGraph.HOME) {
        composable(RouteGraph.HOME) {
            Text("home")
        }
        composable(RouteGraph.CATEGORIES) {
            Text("categories")
        }
        composable(RouteGraph.DEALS) {
            Text("deals")
        }
        composable(RouteGraph.SETTINGS) {
            Text("settings")
        }
    }
}

object RouteGraph {
    const val HOME = "home"
    const val CATEGORIES = "categories"
    const val DEALS = "deals_offers"
    const val SETTINGS = "settings"
}