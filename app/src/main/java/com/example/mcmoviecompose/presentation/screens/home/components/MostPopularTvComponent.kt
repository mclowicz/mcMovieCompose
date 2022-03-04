package com.example.mcmoviecompose.presentation.screens.home.components

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.mcmoviecompose.util.Resource
import com.mclowicz.mcmovie.data.model.tv.PopularTvResult

class MostPopularTvComponent(
    override val data: Resource<PopularTvResult>? = null
): HomeComponent(data = data) {
    override val items: MutableState<List<Any>?> = mutableStateOf(null)
    override var title: MutableState<String?> = mutableStateOf(null)
    override fun setTitle(title: String?) {
        this.title.value = title
    }

    init {
        refreshData()
    }

    private fun refreshData() {
        data?.data?.results?.let {
            items.value = it
        }
    }
}