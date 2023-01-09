package com.superapp.tingtongapp.composetutorial.di
import com.superapp.tingtongapp.composetutorial.response.details.GameDetails
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("games")
    suspend fun getGamesList(): Response<GamesListResponse>


    @GET("game")
    suspend fun getGamesDetails(
        @Query("id") id:Int
    ):Response<GameDetails>



}