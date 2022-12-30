package com.superapp.tingtongapp.composetutorial.network

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.superapp.tingtongapp.composetutorial.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitBuilder {
    val baseUrl = "https://www.freetogame.com/api/"


    var gson: Gson = GsonBuilder()
        .setLenient()
        .setDateFormat("yyyy-MM-dd hh:mm:ss.S")
        .create()
    private var httpClient=
        OkHttpClient.Builder().retryOnConnectionFailure(true).connectTimeout(60, TimeUnit.SECONDS).build()


    @Singleton
    @Provides
     fun retrofit() = Retrofit.Builder().baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(httpClient)
        .build()
        .create(ApiInterface::class.java)



}