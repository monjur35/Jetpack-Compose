package com.monjur.composenav.di

import com.monjur.composenav.response.GameResponseList
import com.monjur.composenav.response.GameResponseListItem
import com.monjur.composenav.response.details.GameDetails
import retrofit2.Response

interface ApiHelper {

    suspend fun getGamesList(): Response<GameResponseList>
    suspend fun getGameDetails(id :Int): Response<GameDetails>


}
