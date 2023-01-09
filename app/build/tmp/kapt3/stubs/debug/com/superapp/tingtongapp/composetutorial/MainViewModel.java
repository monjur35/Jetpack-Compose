package com.superapp.tingtongapp.composetutorial;

import com.superapp.tingtongapp.composetutorial.response.details.GameDetails;
import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/superapp/tingtongapp/composetutorial/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/superapp/tingtongapp/composetutorial/MainRepository;", "(Lcom/superapp/tingtongapp/composetutorial/MainRepository;)V", "getGameDetails", "Landroidx/lifecycle/MutableLiveData;", "Lcom/superapp/tingtongapp/composetutorial/response/details/GameDetails;", "id", "", "getGameList", "Lcom/superapp/tingtongapp/composetutorial/response/gamesList/GamesListResponse;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.superapp.tingtongapp.composetutorial.MainRepository mainRepository = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.superapp.tingtongapp.composetutorial.MainRepository mainRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse> getGameList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.superapp.tingtongapp.composetutorial.response.details.GameDetails> getGameDetails(int id) {
        return null;
    }
}