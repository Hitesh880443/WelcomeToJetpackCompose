package com.hitesh.myjetpackcomposeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.hitesh.myjetpackcomposeapp.ui.pink300
import com.hitesh.myjetpackcomposeapp.ui.white

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppPage()
        }
    }
}

@Preview
@Composable
fun MyAppPage() {
    MaterialTheme {
        Column(verticalArrangement = Arrangement.Top) {
            MyAppBar("Compose Example")
            MyBody()
        }
    }
}

@Composable
fun MyAppBar(title: String) {
    TopAppBar(title = {
        Text(text = title)
    })
}

@Composable
fun MyBody() {
    ScrollableColumn {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            for (i in 1..10) {
                Card(
                    shape = RoundedCornerShape(size = 10.dp),
                    backgroundColor = pink300,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(verticalArrangement = Arrangement.Top) {
                        val logo = imageResource(R.drawable.compose)
                        Image(asset = logo, modifier = Modifier.height(100.dp))
                        Text(
                            text = "Jetpack Logo $i",
                            textAlign = TextAlign.Center,
                            color = white,
                            fontWeight = FontWeight(900),
                            modifier = Modifier.absolutePadding(left = 10.dp, bottom = 10.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
            }

        }

    }

}
