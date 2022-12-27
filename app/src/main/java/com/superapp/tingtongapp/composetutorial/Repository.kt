package com.superapp.tingtongapp.composetutorial

import com.superapp.tingtongapp.composetutorial.network.ApiInterface
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val apiInterface: ApiInterface) {
    suspend fun getGameList():Response<GamesListResponse> = apiInterface.getGamesList()

}