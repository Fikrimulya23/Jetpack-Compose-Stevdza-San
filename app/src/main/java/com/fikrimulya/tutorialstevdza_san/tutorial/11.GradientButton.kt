package com.fikrimulya.tutorialstevdza_san.tutorial

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GradientButton() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        GradientButtonComposable(
            Brush.linearGradient(
                listOf(
                    Color(0XFF0061FF),
                    Color(0XFF60EFFF),
                )
            )
        )
        GradientButtonComposable(
            Brush.verticalGradient(
                listOf(
                    Color(0XFFFF930F),
                    Color(0XFFFFF95B),
                )
            )
        )
        GradientButtonComposable(
            Brush.horizontalGradient(
                listOf(
                    Color(0XFFE81CFF),
                    Color(0XFF40C9FF),
                )
            )
        )
    }
}

@Composable
fun GradientButtonComposable(
    brush: Brush
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
        ),
        onClick = {},
    ) {
        Box(
            modifier = Modifier
                .background(
                    brush = brush,
                    shape = RoundedCornerShape(4.dp)
                )
                .padding(16.dp, 8.dp),
        ) {
            Text(text = "Button")
        }
    }
}

@Preview
@Composable
private fun GradientButtonPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
    ) {
        GradientButton()
    }
}