package com.example.mcmoviecompose.presentation.screens.home.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mcmoviecompose.presentation.screens.home.components.HomeComponent

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeMore(
    component: HomeComponent
) {
    Card(
        shape = RoundedCornerShape(6.dp),
        border = BorderStroke(1.dp, Color.White),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Row() {
                Text(
                    text = component.title.value.toString(),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
            Row(
                modifier = Modifier.padding(0.dp, 8.dp)
            ) {
                component.items.value?.let {
                    LazyRow() {
                        items(items = it) {
                            CardMore(data = it)
                        }
                    }
                }
            }
        }
    }
}

