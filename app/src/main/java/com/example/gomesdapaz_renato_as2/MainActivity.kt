package com.example.gomesdapaz_renato_as2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.layout.ContentScale
import com.example.gomesdapaz_renato_as2.ui.theme.GomesdaPaz_Renato_AS2Theme

data class Artwork(
    val imageRes: Int,
    val name: String,
    val championships: String,
    val championYears: String
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GomesdaPaz_Renato_AS2Theme {
                ArtSpaceApp()
            }
        }
    }
}

@Composable
fun ArtSpaceApp() {
    val artworks = listOf(
        Artwork(
            R.drawable.emerson_fittipaldi,
            "Emerson Fittipaldi",
            "2× Formula One World Champion",
            "1972 and 1974"
        ),
        Artwork(
            R.drawable.nelson_piquet,
            "Nelson Piquet",
            "3× Formula One World Champion",
            "1981, 1983, and 1987"
        ),
        Artwork(
            R.drawable.ayrton_senna,
            "Ayrton Senna",
            "3× Formula One World Champion",
            "1988, 1990, and 1991"
        )
    )

    var currentArtworkIndex by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val currentArtwork = artworks[currentArtworkIndex]

        Image(
            painter = painterResource(id = currentArtwork.imageRes),
            contentDescription = currentArtwork.name,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = currentArtwork.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = currentArtwork.championships,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = currentArtwork.championYears,
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = {
                    currentArtworkIndex = if (currentArtworkIndex > 0) {
                        currentArtworkIndex - 1
                    } else {
                        artworks.size - 1
                    }
                }
            ) {
                Text(text = "Previous")
            }

            Button(
                onClick = {
                    currentArtworkIndex = (currentArtworkIndex + 1) % artworks.size
                }
            ) {
                Text(text = "Next")
            }
        }
    }
}
