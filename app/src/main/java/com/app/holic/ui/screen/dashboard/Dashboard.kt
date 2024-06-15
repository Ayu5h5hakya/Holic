package com.app.holic.ui.screen.dashboard

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun Dashboard() {
    Scaffold(bottomBar = {
        HolicBottomBar()
    }) { innerPadding ->
        Home(Modifier.padding(innerPadding))
    }
}

@Composable
fun HolicBottomBar(modifier: Modifier = Modifier) {
    var selectedIndex by remember { mutableIntStateOf(0) }
    val items = listOf(
        DashboardItem(
            label = "Home",
            icon = Icons.Default.Home
        ),
        DashboardItem(
            label = "Categories",
            icon = Icons.Default.Menu
        ),
        DashboardItem(
            label = "Deals & Offers",
            icon = Icons.Default.Star
        ),
        DashboardItem(
            label = "Settings",
            icon = Icons.Default.Settings
        ),
    )
    NavigationBar {
        items.forEachIndexed { index, dashboardItem ->
            NavigationBarItem(
                selected = index == selectedIndex,
                onClick = {
                    selectedIndex = index
                },
                icon = {
                    Icon(
                        imageVector = items[index].icon,
                        contentDescription = items[index].label
                    )
                }
            )
        }
    }
}

data class DashboardItem(
    val label: String,
    val icon: ImageVector
)