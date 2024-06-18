package com.fikrimulya.tutorialstevdza_san.tutorial

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ColumnsAndRowsViews() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        CustomItem(3f, Color.Red)
        CustomItem(1f, Color.Blue)
    }
}

@Composable
fun ColumnScope.CustomItem(weight: Float, color: Color = MaterialTheme.colorScheme.primary) {
    // ColumnScope ditambahkan ketika ingin menggunakan weight namun composable
    // tidak berada dalam column
    Surface(
        modifier = Modifier
            .width(200.dp)
            //.height(50.dp),
            .weight(weight),
        color = color,
    ) { }
}

@Composable
@Preview(showBackground = true)
fun PreviewColumnsAndRowsViews() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
    ) {
        ColumnsAndRowsViews()
    }
}