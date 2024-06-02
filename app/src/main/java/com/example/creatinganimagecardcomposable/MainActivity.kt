package com.example.creatinganimagecardcomposable

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val paintetr = painterResource(id = R.drawable.x)
            val Description = "This is a description"
            val title = "This is a title"
            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(0.5f)
                , contentAlignment = Alignment.Center
            ) {
                Cardh(
                    painter = paintetr,
                    contentDescription = Description,
                    title = title,
                    modifier = Modifier
                )
            }

        }


    }
}


@Composable
fun Cardh(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(), shape = RoundedCornerShape(15.dp)

    ) {
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black),
                            startY = 300f
                        )
                    )
            )
                        Box (
                        modifier = Modifier
                            .fillMaxSize()
                            .fillMaxSize()
                            .padding(12.dp)
                            , contentAlignment = Alignment.BottomStart
            ) {
                Text(text = title, style = TextStyle(color = Color.White), fontSize = 16.sp)
            }


        }


    }
}

@Preview(showSystemUi = true)
@Composable
private fun Hh() {
    val paintetr = painterResource(id = R.drawable.x)
    val Description = "This is a description"
    val title = "This is a title"
    Box(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(0.5f)
            , contentAlignment = Alignment.Center
    ) {
        Cardh(
            painter = paintetr,
            contentDescription = Description,
            title = title,
            modifier = Modifier
        )
    }
}
