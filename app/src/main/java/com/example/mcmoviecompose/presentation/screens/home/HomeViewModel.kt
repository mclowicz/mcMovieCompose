package com.example.mcmoviecompose.presentation.screens.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.viewModelScope
import com.example.mcmoviecompose.data.repository.MovieRepository
import com.example.mcmoviecompose.presentation.base.BaseViewModel
import com.example.mcmoviecompose.presentation.screens.home.components.HomeComponent
import com.example.mcmoviecompose.presentation.screens.home.components.HomeScreenComposer
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.collect
import javax.inject.Inject

@InternalCoroutinesApi
@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: MovieRepository
) : BaseViewModel() {

    val homeComponents = mutableStateOf<List<HomeComponent>>(listOf())

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch {
            combine(
                request(repository.getMostPopularMovies()),
                request(repository.getTopRatedMovies()),
                request(repository.getMostPopularTvShows()),
                request(repository.getPopularPeoples())
            ) { moviesResource, topRatedResource, tvResource, peoplesResource ->
                HomeScreenComposer.compose(
                    moviesResource,
                    topRatedResource,
                    tvResource,
                    peoplesResource
                )
                    .also {
                        homeComponents.value = it
                    }
            }
                .collect { }
        }
    }
}