package com.superapp.tingtongapp.composetutorial.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.superapp.tingtongapp.composetutorial.Repository;
import com.superapp.tingtongapp.composetutorial.RepositoryImpl;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\n \u0014*\u0004\u0018\u00010\u00120\u0012H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/superapp/tingtongapp/composetutorial/network/RetrofitBuilder;", "", "()V", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "httpClient", "Lokhttp3/OkHttpClient;", "provideRepository", "Lcom/superapp/tingtongapp/composetutorial/Repository;", "apiInterface", "Lcom/superapp/tingtongapp/composetutorial/network/ApiInterface;", "retrofit", "kotlin.jvm.PlatformType", "app_debug"})
@dagger.Module()
public final class RetrofitBuilder {
    @org.jetbrains.annotations.NotNull()
    public static final com.superapp.tingtongapp.composetutorial.network.RetrofitBuilder INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String baseUrl = "https://www.freetogame.com/api/";
    @org.jetbrains.annotations.NotNull()
    private static com.google.gson.Gson gson;
    private static okhttp3.OkHttpClient httpClient;
    
    private RetrofitBuilder() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.superapp.tingtongapp.composetutorial.network.ApiInterface retrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.superapp.tingtongapp.composetutorial.Repository provideRepository(@org.jetbrains.annotations.NotNull()
    com.superapp.tingtongapp.composetutorial.network.ApiInterface apiInterface) {
        return null;
    }
}