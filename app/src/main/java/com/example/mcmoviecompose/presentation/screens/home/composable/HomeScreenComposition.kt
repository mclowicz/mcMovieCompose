package com.example.mcmoviecompose.presentation.screens.home.composable

import androidx.compose.runtime.Composable
import com.example.mcmoviecompose.presentation.screens.home.HomeHeader
import com.example.mcmoviecompose.presentation.screens.home.components.*

@Composable
fun HomeScreenComposition(component: HomeComponent) {
    when (component) {
        is HomeHeaderComponent -> HomeHeader()
        is MostPopularMoviesComponent,
        is MostPopularTvComponent,
        is MostPopularPeopleComponent -> HomeMore(component)
        is HomeFooterComponent -> HomeFooter()
    }
}