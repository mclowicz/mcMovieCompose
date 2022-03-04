package com.example.mcmoviecompose.presentation.screens.home.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.mcmoviecompose.presentation.screens.home.components.HomeComponent
import com.example.mcmoviecompose.util.Resource
import com.example.mcmoviecompose.util.Status
import com.mclowicz.mcmovie.data.model.movie.PopularMovie
import com.mclowicz.mcmovie.data.model.person.PopularPerson
import com.mclowicz.mcmovie.data.model.tv.PopularTv
import java.lang.Exception

@Composable
fun CardMore(data: Any) {
    val item: Pair<String?, String?> = convertData(data)
    val painter = rememberImagePainter(data = "https://image.tmdb.org/t/p/w500${item.second}") {
        placeholder(com.example.mcmoviecompose.R.drawable.ic_placeholder)
        error(com.example.mcmoviecompose.R.drawable.ic_placeholder)
    }
    Card(
        modifier = Modifier
            .padding(4.dp)
            .background(Color.White)
            .height(230.dp)
            .width(120.dp),
        shape = RoundedCornerShape(6.dp),
        border = BorderStroke(1.dp, Color.White),
        elevation = 6.dp
    ) {
        Column() {
            Row() {
                Image(
                    painter = painter,
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp)
                )
            }
            Row() {
                Text(
                    modifier = Modifier
                        .width(120.dp)
                        .padding(8.dp),
                    text = item.first.orEmpty(),
                    fontSize = 12.sp,
                    maxLines = 2,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

private fun convertData(data: Any) = when (data) {
    is PopularPerson -> Pair(data.name, data.profilePath)
    is PopularMovie -> Pair(data.title, data.posterPath)
    is PopularTv -> Pair(data.name, data.posterPath)
    else -> throw Exception("xxx")
}