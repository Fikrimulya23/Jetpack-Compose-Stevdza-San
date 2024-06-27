package com.fikrimulya.tutorialstevdza_san.tutorial

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextFieldExample() {
    Column(
        modifier = Modifier.padding(12.dp)
    ) {
        TextFieldComposable()
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextFieldComposable()
        Spacer(modifier = Modifier.height(8.dp))
        BasicTextFieldComposable()
    }
}

@Composable
fun TextFieldComposable() {
    var textValue by remember {
        mutableStateOf("")
    }
    Column(
        horizontalAlignment = Alignment.End
    ) {
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    BorderStroke(
                        width = 1.dp,
                        brush = Brush.linearGradient(
                            listOf(Color.Green, Color.Blue)
                        ),
                    ),
                    shape = RoundedCornerShape(50.dp),
                ),
            shape = RoundedCornerShape(50.dp),
            value = textValue,
            onValueChange = {
                newValue ->
                    if (newValue.length <= 10) {
                        textValue = newValue
                    }
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Home,
                    contentDescription = "Home Icon",
                    tint = Color.Gray
                    )
            },
            placeholder = {
                Text(
                    text = "Placeholder",
                    style = TextStyle(
                        color = Color.Gray
                    ),
                )
            },
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                errorContainerColor = Color.Transparent,
            ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done,
            ),
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = "${textValue.length}/10",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                color = Color.Gray.copy(alpha = 0.8f)
            )
        )
    }
}

@Composable
fun OutlinedTextFieldComposable() {
    var textValue by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        value = textValue,
        onValueChange = { newValue -> textValue = newValue },
        maxLines = 5,
        label = {
            Text(text = "My Label")
        },
        minLines = 2,
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.Words,
        )
    )
}

@Composable
fun BasicTextFieldComposable() {
    var textValue by remember {
        mutableStateOf("")
    }

    BasicTextField(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 3.dp,
                color = Color.Gray,

            )
            .padding(16.dp)
        ,
        value = textValue,
        onValueChange = {
            newValue -> textValue = newValue
        },
        maxLines = 1,
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Send,
            keyboardType = KeyboardType.Email,

        )
    )
}

@Preview(showBackground = true)
@Composable
fun TextFieldExamplePreview() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
    ) {
        TextFieldExample()
    }
}