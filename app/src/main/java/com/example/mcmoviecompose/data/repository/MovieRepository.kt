package com.example.mcmoviecompose.data.repository

import com.example.mcmoviecompose.data.network.MovieApiService
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val apiService: MovieApiService
) {

    fun getMostPopularMovies() = apiService.getMostPopularMovies()

    fun getTopRatedMovies() = apiService.getTopRatedMovies()

    fun getMostPopularTvShows() = apiService.getMostPopularTvShows()

    fun getPopularPeoples() = apiService.getPopularPeoples()

    fun getMovieDetail(id: Int) = apiService.getMovieDetail(id)

    fun getTvDetail(id: Int) = apiService.getTvDetail(id)

    fun getPersonDetail(id: Int) = apiService.getPersonDetail(id)
}