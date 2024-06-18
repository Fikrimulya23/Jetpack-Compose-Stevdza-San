package com.fikrimulya.tutorialstevdza_san.tutorial

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fikrimulya.tutorialstevdza_san.R

@Composable
fun TextCustomizationView() {
    Column {
        // 1
        Text(
            text = stringResource(id = R.string.app_name),
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primary)
                .padding(20.dp)
                .fillMaxWidth(),
            color = Color.White,
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            )
        // 2
        Text(buildAnnotatedString {
            withStyle(
                style = ParagraphStyle(
                    textAlign = TextAlign.Center,
                )
            ) {
                withStyle(
                    style = SpanStyle(
                        color = Color.Magenta,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                    )
                ) {
                    append("A")
                }
                append("B")
                append("C")
                append("D")
            }
        }, modifier = Modifier.fillMaxWidth(),)
        // 3
        Text(
            text = "Hello World! ".repeat(20),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            )
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewTextCustomizationView() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        TextCustomizationView()
    }
}