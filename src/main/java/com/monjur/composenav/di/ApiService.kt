package com.monjur.composenav.di

import com.monjur.composenav.response.GameResponseList
import com.monjur.composenav.response.GameResponseListItem
import com.monjur.composenav.response.details.GameDetails
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("games")
    suspend fun getGamesList(): Response<GameResponseList>


    @GET("game")
    suspend fun getGamesDetails(
        @Query("id") id:Int
    ):Response<GameDetails>



}