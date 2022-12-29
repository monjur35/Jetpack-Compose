package com.superapp.tingtongapp.composetutorial;

import com.superapp.tingtongapp.composetutorial.network.ApiInterface;
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse;
import retrofit2.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/superapp/tingtongapp/composetutorial/Repository;", "", "apiInterface", "Lcom/superapp/tingtongapp/composetutorial/network/ApiInterface;", "(Lcom/superapp/tingtongapp/composetutorial/network/ApiInterface;)V", "getGameList", "Lretrofit2/Response;", "Lcom/superapp/tingtongapp/composetutorial/response/gamesList/GamesListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class Repository {
    private final com.superapp.tingtongapp.composetutorial.network.ApiInterface apiInterface = null;
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    com.superapp.tingtongapp.composetutorial.network.ApiInterface apiInterface) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getGameList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse>> continuation) {
        return null;
    }
}