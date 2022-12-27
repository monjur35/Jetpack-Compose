package com.superapp.tingtongapp.composetutorial

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import javax.inject.Inject

@HiltViewModel
class GameViewModel @Inject constructor(val repository: Repository)  :ViewModel() {

    val errorMessage = MutableLiveData<String>()
    var job: Job? = null
    val loading = MutableLiveData<Boolean>()
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        
    }



    fun getGameList(): MutableLiveData<GamesListResponse> {
         val gamesListResponseLiveData=MutableLiveData<GamesListResponse>()
         job= CoroutineScope(Dispatchers.IO+exceptionHandler).launch { 
             val response=repository.getGameList()
             if (response.isSuccessful){
                 gamesListResponseLiveData.postValue(response.body())
             }
             else{
                 onError(response.message())
                 Log.e("TAG", "getGameList: $response", )
             }
         }

        return gamesListResponseLiveData

    }

    private fun onError(message: String) {
        errorMessage.postValue(message)
    }
}