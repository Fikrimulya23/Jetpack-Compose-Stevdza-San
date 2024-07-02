package com.fikrimulya.tutorialstevdza_san.tutorial

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fikrimulya.tutorialstevdza_san.R

@Composable
fun SignUpWithGoogleButton(
    text: String = "Sign Up with Google",
    loadingText: String = "Creating Account...",
    icon: Painter = painterResource(id = R.drawable.ic_google_logo),
    shape: Shape = RoundedCornerShape(8.dp),
    borderColor: Color = Color.LightGray,
    backgroundColor: Color = MaterialTheme.colorScheme.surface,
    circularIndicatorColor: Color = MaterialTheme.colorScheme.primary,
) {
    var isClicked by remember {
        mutableStateOf(false)
    }
   Column(
       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally,
   ) {
       Surface(
           onClick = { isClicked = !isClicked },
           shape = shape,
           border = BorderStroke(
             width = 1.dp,
             color = borderColor,
           ),
           color = backgroundColor,
       ) {
           Row(
               modifier = Modifier
                   .padding(
                       start = 12.dp,
                       top = 12.dp,
                       end = 16.dp,
                       bottom = 12.dp
                   )
                   .animateContentSize(
                       animationSpec = tween(
                           durationMillis = 300,
                           easing = FastOutSlowInEasing,
                       )
                   ),
               horizontalArrangement = Arrangement.Center,
               verticalAlignment = Alignment.CenterVertically,
           ) {
               Icon(
                   painter = icon,
                   contentDescription = "Google Logo",
                   tint = Color.Unspecified,
               )
               Spacer(modifier = Modifier.width(8.dp))
               Text(text = if (!isClicked) text else loadingText)
               if (isClicked) {
                   Spacer(modifier = Modifier.width(16.dp))
                   CircularProgressIndicator(
                       modifier = Modifier
                           .width(16.dp)
                           .height(16.dp),
                       strokeWidth = 2.dp,
                       color = circularIndicatorColor,
                   )
               }
           }
       }
   }
}

@Preview(showBackground = true)
@Composable
private fun SignUpWithGoogleButtonPreview() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        SignUpWithGoogleButton()
    }
}