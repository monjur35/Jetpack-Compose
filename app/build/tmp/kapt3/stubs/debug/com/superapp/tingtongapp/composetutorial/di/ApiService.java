package com.superapp.tingtongapp.composetutorial.di;

import com.superapp.tingtongapp.composetutorial.response.details.GameDetails;
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/superapp/tingtongapp/composetutorial/di/ApiService;", "", "getGamesDetails", "Lretrofit2/Response;", "Lcom/superapp/tingtongapp/composetutorial/response/details/GameDetails;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGamesList", "Lcom/superapp/tingtongapp/composetutorial/response/gamesList/GamesListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "games")
    public abstract java.lang.Object getGamesList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "game")
    public abstract java.lang.Object getGamesDetails(@retrofit2.http.Query(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.superapp.tingtongapp.composetutorial.response.details.GameDetails>> continuation);
}