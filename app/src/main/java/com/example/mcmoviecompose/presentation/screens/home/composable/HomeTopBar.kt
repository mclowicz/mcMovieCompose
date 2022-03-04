package com.example.mcmoviecompose.presentation.screens.home

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mcmoviecompose.ui.theme.topAppBarBgColor
import com.example.mcmoviecompose.ui.theme.topAppBarContentColor

@Composable
fun HomeTopBar() {
    TopAppBar(
        title = {
            Text(
                text = "mcMovie",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBgColor,
    )
}

@Composable
@Preview
fun HomeTopBarPreview() {
    HomeTopBar()
}