package com.monjur.composenav;

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.monjur.composenav.response.GameResponseList
import com.monjur.composenav.response.details.GameDetails
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository) : ViewModel() {


    var job: Job? = null
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->

        Log.e("TAG1", "Error : ${throwable.localizedMessage}")
    }

    fun getGameList(): MutableLiveData<GameResponseList> {
        val responseLiveData = MutableLiveData<GameResponseList>()

        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            val response = mainRepository.getGameList()

            withContext(Dispatchers.Main) {
                if (response.isSuccessful) {
                    responseLiveData.postValue(response.body())
                } else {
                    Log.e("TAG1", "getGameList: ${response.message()}")
                    Log.e("TAG1", "getGameList: $response")
                }
            }
        }

        return responseLiveData
    }


    fun getGameDetails(id: Int): MutableLiveData<GameDetails> {
        val responseLiveDataaa = MutableLiveData<GameDetails>()



        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {


            val response = mainRepository.getGameDetails(id)

            withContext(Dispatchers.Main) {
                if (response.isSuccessful) {
                    responseLiveDataaa.postValue(response.body())
                } else {
                    Log.e("TAG", "getGameDetails: ${response.message()}")
                    Log.e("TAG", "getGameDetails: $response")
                }
            }
        }

        return responseLiveDataaa
    }
}
