package com.monjur.composenav.di

import com.monjur.composenav.response.GameResponseList
import com.monjur.composenav.response.GameResponseListItem
import com.monjur.composenav.response.details.GameDetails
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService):ApiHelper {
    override suspend fun getGamesList(): Response<GameResponseList> {
       return apiService.getGamesList()
    }

    override suspend fun getGameDetails(id:Int): Response<GameDetails> {
        return apiService.getGamesDetails(id)
    }


}
