package com.example.mcmoviecompose.util

import retrofit2.Response
import java.lang.Exception

object Util {

    fun <T> toResource(response: Response<T>): Resource<T> {
        return try {
            if (response.isSuccessful) {
                response.body()?.let {
                    return@let Resource.success(it)
                } ?: Resource.error("Error", null)
            } else {
                Resource.error("Error", null)
            }
        } catch (e: Exception) {
            Resource.error("No data!", null)
        }
    }
}