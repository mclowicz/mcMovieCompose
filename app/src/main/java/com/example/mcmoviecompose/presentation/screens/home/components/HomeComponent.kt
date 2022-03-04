package com.example.mcmoviecompose.presentation.screens.home.components

import androidx.compose.runtime.MutableState
import com.example.mcmoviecompose.util.Resource

abstract class HomeComponent(
    open val data: Resource<Any>? = null
) {
    abstract val items: MutableState<List<Any>?>
    abstract var title: MutableState<String?>
    abstract fun setTitle(title: String?)
}