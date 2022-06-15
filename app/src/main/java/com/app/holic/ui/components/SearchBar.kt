package com.app.holic.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar(modifier: Modifier = Modifier, onSearch: () -> Unit = {}) {
    Row(
        modifier
            .background(color = Color.LightGray, shape = RoundedCornerShape(4.dp))
            .padding(12.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Search"
        )
        Spacer(Modifier.width(5.dp))
        Text("Search", modifier.weight(1f))
    }
}