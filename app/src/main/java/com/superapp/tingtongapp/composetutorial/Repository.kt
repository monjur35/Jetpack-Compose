package com.superapp.tingtongapp.composetutorial

import com.superapp.tingtongapp.composetutorial.network.ApiInterface
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponseItem
import retrofit2.Response
import javax.inject.Inject

interface Repository  {
    suspend fun getGameList():Response<GamesListResponse>
    suspend fun getGameDetails(id:Int):Response<GamesListResponseItem>

}