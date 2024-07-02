package com.fikrimulya.tutorialstevdza_san.tutorial

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PasswordTextField() {
    var passwordValue by remember {
        mutableStateOf("")
    }

    var isPasswordSecure by remember {
        mutableStateOf(true)
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        OutlinedTextField(
            value = passwordValue,
            onValueChange = {
                passwordValue = it
            },
            trailingIcon = {
                IconButton(onClick = {
                    isPasswordSecure = !isPasswordSecure
                }) {
                    Icon(
                        imageVector = if (isPasswordSecure) Icons.Outlined.KeyboardArrowDown
                        else Icons.Outlined.KeyboardArrowUp,
                        contentDescription = "Keyboard"
                    )
                }
            },
            placeholder = {
                Text(text = "********")
            },
            label = {
                Text(text = "Password")
            },
            visualTransformation = if (isPasswordSecure) PasswordVisualTransformation()
            else VisualTransformation.None
        )
    }
}

@Preview
@Composable
private fun PasswordTextFieldPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
    ) {
        PasswordTextField()
    }
}