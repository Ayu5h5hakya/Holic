package com.app.holic.ui.screen.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.app.holic.ui.components.SearchBar

@Composable
fun Home(modifier: Modifier = Modifier) {
    Column(modifier.padding(8.dp)) {
        SearchBar()
    }
}