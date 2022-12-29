package com.superapp.tingtongapp.composetutorial.network

import com.superapp.tingtongapp.composetutorial.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitBuilder {
    val baseUrl = "https://www.freetogame.com/api/"

    @Singleton
    @Provides
    private fun retrofit() = Retrofit.Builder().baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiInterface::class.java)


    @Singleton
    @Provides
    fun provideRepository(api:ApiInterface) : Repository = DefualtMainRepository(api)

    private fun DefualtMainRepository(api: ApiInterface): Repository {

    }
}