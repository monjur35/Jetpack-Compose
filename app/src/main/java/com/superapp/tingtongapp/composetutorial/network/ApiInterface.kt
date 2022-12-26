package com.superapp.tingtongapp.composetutorial.network

import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("games")
    suspend fun getGamesList():Response<GamesListResponse>

}