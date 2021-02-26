package com.example.mynewkotlincomposableapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
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
       val typography = MaterialTheme.typography

        Image(
            painter = painterResource(id = R.drawable.header),
            contentDescription = null,
            modifier = Modifier
                .height(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(4.dp)),
            contentScale = ContentScale.Crop
            )

        Spacer(Modifier.height(16.dp))


        Text( "A day wandering through the sandhills " +
                "in Shark Fin Cove, and a few of the " +
                "sights I saw",
            style = typography.h6,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis )

        Text("Davenport, California",
            style = typography.body2)
        Text("December,2018",
            style = typography.body2)
    }
}

@Preview
@Composable
fun PreciewNewStorry(){
    NewStory()
}
