package com.fikrimulya.tutorialstevdza_san.tutorial

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun SuperscriptSubScriptText() {
    Text(text = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = 20.sp
            )
        ) {
            append("TEXT 1")
        }
        withStyle(
            style = SpanStyle(
                fontWeight = FontWeight.Bold,
                baselineShift = BaselineShift.Superscript
            ),
        ) {
            append("TEXT 2")
        }
    })
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