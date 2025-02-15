package com.example.gomesdapaz_renato_as2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.gomesdapaz_renato_as2.ui.theme.GomesdaPaz_Renato_AS2Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GomesdaPaz_Renato_AS2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GomesdaPaz_Renato_AS2(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun GomesdaPaz_Renato_AS2(modifier: Modifier = Modifier) {
    var currentArtwork by remember { mutableStateOf(0) }

    var artworks
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GomesdaPaz_Renato_AS2Theme {
        Greeting("Android")
    }
}