package com.fikrimulya.tutorialstevdza_san.tutorial

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SuperscriptSubScriptText() {

}

@Composable
@Preview(showBackground = true)
fun PreviewSuperscriptSubScriptText() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
    ) {
        SuperscriptSubScriptText()
    }
}