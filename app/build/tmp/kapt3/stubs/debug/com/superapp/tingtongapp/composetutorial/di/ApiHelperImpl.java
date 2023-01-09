package com.superapp.tingtongapp.composetutorial.di;

import com.superapp.tingtongapp.composetutorial.response.details.GameDetails;
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse;
import retrofit2.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/superapp/tingtongapp/composetutorial/di/ApiHelperImpl;", "Lcom/superapp/tingtongapp/composetutorial/di/ApiHelper;", "apiService", "Lcom/superapp/tingtongapp/composetutorial/di/ApiService;", "(Lcom/superapp/tingtongapp/composetutorial/di/ApiService;)V", "getGameDetails", "Lretrofit2/Response;", "Lcom/superapp/tingtongapp/composetutorial/response/details/GameDetails;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGamesList", "Lcom/superapp/tingtongapp/composetutorial/response/gamesList/GamesListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ApiHelperImpl implements com.superapp.tingtongapp.composetutorial.di.ApiHelper {
    private final com.superapp.tingtongapp.composetutorial.di.ApiService apiService = null;
    
    @javax.inject.Inject()
    public ApiHelperImpl(@org.jetbrains.annotations.NotNull()
    com.superapp.tingtongapp.composetutorial.di.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getGamesList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getGameDetails(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.superapp.tingtongapp.composetutorial.response.details.GameDetails>> continuation) {
        return null;
    }
}