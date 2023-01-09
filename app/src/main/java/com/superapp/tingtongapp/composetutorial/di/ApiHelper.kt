package com.superapp.tingtongapp.composetutorial.di
import com.superapp.tingtongapp.composetutorial.response.details.GameDetails
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse
import retrofit2.Response

interface ApiHelper {

    suspend fun getGamesList(): Response<GamesListResponse>
    suspend fun getGameDetails(id :Int): Response<GameDetails>


}
