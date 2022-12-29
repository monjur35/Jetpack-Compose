package com.superapp.tingtongapp.composetutorial.network;

import com.superapp.tingtongapp.composetutorial.Repository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/superapp/tingtongapp/composetutorial/network/RetrofitBuilder;", "", "()V", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "retrofit", "Lcom/superapp/tingtongapp/composetutorial/network/ApiInterface;", "kotlin.jvm.PlatformType", "app_debug"})
@dagger.Module()
public final class RetrofitBuilder {
    @org.jetbrains.annotations.NotNull()
    public static final com.superapp.tingtongapp.composetutorial.network.RetrofitBuilder INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String baseUrl = "https://www.freetogame.com/api/";
    
    private RetrofitBuilder() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseUrl() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.superapp.tingtongapp.composetutorial.network.ApiInterface retrofit() {
        return null;
    }
}