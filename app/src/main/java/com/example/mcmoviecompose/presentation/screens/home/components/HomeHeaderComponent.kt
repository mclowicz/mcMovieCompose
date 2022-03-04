package com.example.mcmoviecompose.presentation.screens.home.components

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import com.example.mcmoviecompose.util.Resource

class HomeHeaderComponent(
    override val data: Resource<Any>? = null
): HomeComponent(data = data) {
    override val items: MutableState<List<Any>?> = mutableStateOf(null)
    override var title: MutableState<String?> = mutableStateOf(null)
    override fun setTitle(title: String?) {
        this.title.value = title
    }
}