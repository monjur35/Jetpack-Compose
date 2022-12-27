package com.superapp.tingtongapp.composetutorial.network;

import dagger.hilt.InstallIn;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/superapp/tingtongapp/composetutorial/network/RetrofitBuilder;", "", "()V", "apiInterface", "Lcom/superapp/tingtongapp/composetutorial/network/ApiInterface;", "getApiInterface", "()Lcom/superapp/tingtongapp/composetutorial/network/ApiInterface;", "apiInterface$delegate", "Lkotlin/Lazy;", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "retrofit$delegate", "app_debug"})
@javax.inject.Singleton()
public final class RetrofitBuilder {
    @org.jetbrains.annotations.NotNull()
    public static final com.superapp.tingtongapp.composetutorial.network.RetrofitBuilder INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String baseUrl = "https://www.freetogame.com/api/";
    private static final kotlin.Lazy retrofit$delegate = null;
    private static final kotlin.Lazy apiInterface$delegate = null;
    
    private RetrofitBuilder() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseUrl() {
        return null;
    }
    
    private final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    private final com.superapp.tingtongapp.composetutorial.network.ApiInterface getApiInterface() {
        return null;
    }
}