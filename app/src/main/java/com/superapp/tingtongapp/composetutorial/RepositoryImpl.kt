package com.superapp.tingtongapp.composetutorial

import com.superapp.tingtongapp.composetutorial.network.ApiInterface
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponseItem
import retrofit2.Response

class RepositoryImpl(private val apiInterface: ApiInterface): Repository{
    override suspend fun getGameList(): Response<GamesListResponse> {
        return apiInterface.getGamesList()

    }

    override suspend fun getGameDetails(id: Int): Response<GamesListResponseItem> {
       return apiInterface.getGamesDetails(id)
    }
}