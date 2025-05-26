package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.surface
                ) {


                    PageDisplay()
                }

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PageDisplay() {

    val image = painterResource(R.drawable.bg_compose_background)

    Column {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.height(100.dp),
            contentScale = ContentScale.FillWidth
        )

        Text(text = stringResource(R.string.topic_title),
            fontSize = 24.sp,
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
                .align(alignment = Alignment.CenterHorizontally))

        Text(text = stringResource(R.string.description_1,),
            textAlign = TextAlign.Justify)

        Text(text = stringResource(R.string.description_2),
            textAlign = TextAlign.Justify, modifier = Modifier.padding(
                start = 10.dp, end = 10.dp))
    }
}

