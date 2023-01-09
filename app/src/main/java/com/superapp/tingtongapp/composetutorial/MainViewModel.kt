package com.superapp.tingtongapp.composetutorial
import com.superapp.tingtongapp.composetutorial.response.details.GameDetails
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository):ViewModel(){

    fun getGameList(): MutableLiveData<GamesListResponse> {
        val responseLiveData=MutableLiveData<GamesListResponse>()

        viewModelScope.launch {
            val  response=mainRepository.getGameList()
          if (response.isSuccessful){
              responseLiveData.postValue(response.body())
          }
            else{
              Log.e("TAG", "getGameList: ${response.message()}", )
              Log.e("TAG", "getGameList: $response", )
          }
        }

        return responseLiveData
    }


    fun getGameDetails(id:Int): MutableLiveData<GameDetails> {
        val responseLiveDataaa=MutableLiveData<GameDetails>()

        viewModelScope.launch {
            val  response=mainRepository.getGameDetails(id)
          if (response.isSuccessful){
              responseLiveDataaa.postValue(response.body())
          }
            else{
              Log.e("TAG", "getGameDetails: ${response.message()}", )
              Log.e("TAG", "getGameDetails: $response", )
          }
        }

        return responseLiveDataaa
    }
}
