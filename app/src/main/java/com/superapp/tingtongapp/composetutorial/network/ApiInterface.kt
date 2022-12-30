package com.superapp.tingtongapp.composetutorial.network

import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponseItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("games")
    suspend fun getGamesList():Response<GamesListResponse>


  @GET("games")
    suspend fun getGamesDetails(
      @Query("id") id:Int
    ):Response<GamesListResponseItem>

}