package com.fikrimulya.tutorialstevdza_san.tutorial

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.fikrimulya.tutorialstevdza_san.R

/*
* Install Coil
* implementation("io.coil-kt:coil-compose:2.6.0")
* Source: https://github.com/coil-kt/coil
*
* Add Internet Permission <uses-permission android:name="android.permission.INTERNET"/>
* Add android:usesCleartextTraffic="true" to application tag inside AndroidManifest.xml
*
* Without this atribute, your image will not shown
* The application has android:usesCleartextTraffic set to true, which allows it to access resources
* that do not use encryption, a situation that could be exploited by an attacker to perform MitM
* attacks and compromise the confidentiality and integrity of the application.
* */

@Composable
fun CoilLoadingImage() {
    val url = "https://cdn4.iconfinder.com/data/icons/logos-brands-7/512/google_logo-google_icongoogle-512.png"
    Box(
        modifier = Modifier
            .height(150.dp)
            .width(150.dp),
        contentAlignment = Alignment.Center
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(url)
                .crossfade(true)
                .build(),
            contentDescription = "Google Icon",
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun CoilLoadingImagePreview() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
    ) {
        CoilLoadingImage()
    }
}
