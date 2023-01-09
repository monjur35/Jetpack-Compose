package com.superapp.tingtongapp.composetutorial.di
import com.superapp.tingtongapp.composetutorial.response.details.GameDetails
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService): ApiHelper {
    override suspend fun getGamesList(): Response<GamesListResponse> {
       return apiService.getGamesList()
    }

    override suspend fun getGameDetails(id:Int): Response<GameDetails> {
        return apiService.getGamesDetails(id)
    }


}
