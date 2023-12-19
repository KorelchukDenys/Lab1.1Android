package com.example.lab11

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfilePage()
        }
    }
}


@Composable
fun ProfilePage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(40.dp)
            .clip(RoundedCornerShape(10)),
        contentAlignment = Alignment.TopCenter,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.rocky),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(70.dp)
                    .fillMaxSize()
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Rocky Balbao",
                    fontSize = (20.sp),
                    fontWeight = FontWeight.Bold
                )
                Icon(Icons.Filled.Add, contentDescription = "Add Icon")


            }
            Text(
                text = "Planet Earth",
                color = Color.Gray
            )
            Text(text = "My name is Rocky. And I am best boxer in film history.")
            Row(
                horizontalArrangement = Arrangement.spacedBy(40.dp),
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.cameraicon),
                        contentDescription = "Profile Picture",
                        modifier = Modifier
                            .size(28.dp))
                    Text(text = "27 posts", color = Color.Gray)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.followers),
                        contentDescription = "Followers Icon",
                        modifier = Modifier
                            .size(28.dp))
                    Text(text = "100000 followers", color = Color.Gray)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.followers),
                        contentDescription = "Following Icon",
                        modifier = Modifier
                            .size(28.dp))
                    Text(text = "16 following", color = Color.Gray)
                }
            }
        }
    }
}
@Preview
@Composable
fun ProfilePagePreview() {
    ProfilePage()
}