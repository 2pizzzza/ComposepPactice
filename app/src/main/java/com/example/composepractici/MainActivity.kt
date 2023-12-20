package com.example.composepractici

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import com.example.composepractici.ui.theme.ComposePracticiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            newText(

            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun newText(){
    Column (
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxHeight()
            .fillMaxWidth(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .background(Color.Cyan)
        ) {
            Text(text = "Hello World",
                color = Color.Black,
                fontFamily = FontFamily.Monospace
            )
            Text(text = "Hello World",
                color = Color.Black,
                fontFamily = FontFamily.Monospace
            )
        }
        Row {
            Text(text = "Hello World",
                color = Color.Black,
                fontFamily = FontFamily.Monospace
            )
            Text(text = "Hello World",
                color = Color.Black,
                fontFamily = FontFamily.Monospace
            )
        }
    }
}

@Preview (showBackground = true)
@Composable
fun novba(){
    Row (
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .height(Dp(40f)),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "home",
            fontSize = 20.sp
            )
        Text(
            text = "Market",
            fontSize = 20.sp
            )
        Text(
            text = "Account",
            fontSize = 20.sp,

            )

    }
}
