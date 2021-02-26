package com.example.mynewkotlincomposableapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewkotlincomposableapp.ui.theme.MyNewKotlinComposableAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewStory()
        }
    }
}

@Composable
fun NewStory(){
    Column(modifier = Modifier.padding(16.dp)) {
        Image(
            painter = painterResource(id = R.drawable.header),
            contentDescription = null)
        Text("Shark fin view image")
        Text("Kohedamnda,California")
        Text("December,2018")
    }
}

@Preview
@Composable
fun PreciewNewStorry(){
    NewStory()
}
