package com.fikrimulya.tutorialstevdza_san.tutorial.LazyColumn.Views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fikrimulya.tutorialstevdza_san.tutorial.LazyColumn.Models.LazyColumnModel
import com.fikrimulya.tutorialstevdza_san.tutorial.LazyColumn.Repositories.LazyColumnRepository

@Composable
fun LazyColumnExample() {
    val repository = LazyColumnRepository()
    val getAllData = repository.getAllData()
    LazyColumn(
        contentPadding = PaddingValues(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(items = getAllData) {
            LazyColumnItem(item = it)
        }
    }
}

@Composable
fun LazyColumnItem(item: LazyColumnModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.LightGray)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(text = item.id.toString())
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(text = "${item.firstName} ${item.lastName}}")
            Text(text = item.age.toString())
        }
        Spacer(modifier = Modifier.weight(1f))
        Text(text = item.age.toString())
    }
}

@Preview
@Composable
private fun LazyColumnExamplePreview() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
    ) {
        LazyColumnExample()
    }
}