package com.example.apple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.apple.ui.theme.AppleTheme
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppleTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        name = stringResource(R.string.happy_birthday_text),
                        from = stringResource(R.string.signature_text),
                        modifier = Modifier)
                }

            }
        }
    }
}


@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(8.dp),
        verticalArrangement = Arrangement.Center)
    {
        Text(
            text = message,
            fontSize = 36.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = "from: $from",
            modifier = modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally))

    }


}


 @Composable
 fun GreetingImage(name: String, from: String, modifier: Modifier) {
     val image = painterResource(R.drawable.androidparty)

     Box (modifier = Modifier){
         Image (
             painter = image,
             contentDescription = null,
             contentScale = ContentScale.Crop,
             alpha = 0.5f

         )
     }

     GreetingText(message = "Congratulations Churchil Basil",
         from = "Soila",
         modifier = Modifier)
 }

@Preview(showBackground = true)
@Composable
fun PreviewBirthdayCard() {
    AppleTheme {
        GreetingImage("", "", modifier = Modifier)
    }
}





