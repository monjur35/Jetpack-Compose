package com.superapp.tingtongapp.composetutorial.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    val baseUrl = "https://www.freetogame.com/api/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    private val apiInterface: ApiInterface by lazy {
        retrofit.create(ApiInterface::class.java)
    }
}