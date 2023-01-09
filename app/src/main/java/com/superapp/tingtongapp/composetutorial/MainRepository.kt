package com.superapp.tingtongapp.composetutorial
import com.superapp.tingtongapp.composetutorial.di.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getGameList() = apiHelper.getGamesList()
    suspend fun getGameDetails(id:Int) = apiHelper.getGameDetails(id)
}