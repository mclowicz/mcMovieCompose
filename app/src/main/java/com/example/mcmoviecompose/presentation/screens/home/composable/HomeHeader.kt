package com.example.mcmoviecompose.presentation.screens.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mcmoviecompose.R

@Composable
fun HomeHeader() {
    Card(
        shape = RoundedCornerShape(6.dp),
        border = BorderStroke(1.dp, Color.White),
        modifier = Modifier.padding(8.dp)
    ) {
        Image(
            painterResource(R.drawable.cinema),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
    }
}

@Preview
@Composable
fun HomeHeaderPreview() {
    HomeHeader()
}