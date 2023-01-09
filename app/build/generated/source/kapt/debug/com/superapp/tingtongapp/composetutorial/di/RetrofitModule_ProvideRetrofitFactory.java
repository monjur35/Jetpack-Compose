// Generated by Dagger (https://dagger.dev).
package com.superapp.tingtongapp.composetutorial.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<String> baseUrlProvider;

  public RetrofitModule_ProvideRetrofitFactory(Provider<OkHttpClient> okHttpClientProvider,
      Provider<String> baseUrlProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
    this.baseUrlProvider = baseUrlProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(okHttpClientProvider.get(), baseUrlProvider.get());
  }

  public static RetrofitModule_ProvideRetrofitFactory create(
      Provider<OkHttpClient> okHttpClientProvider, Provider<String> baseUrlProvider) {
    return new RetrofitModule_ProvideRetrofitFactory(okHttpClientProvider, baseUrlProvider);
  }

  public static Retrofit provideRetrofit(OkHttpClient okHttpClient, String baseUrl) {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.provideRetrofit(okHttpClient, baseUrl));
  }
}
