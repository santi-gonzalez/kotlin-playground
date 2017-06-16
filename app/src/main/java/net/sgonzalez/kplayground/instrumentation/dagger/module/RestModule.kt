package net.sgonzalez.kplayground.instrumentation.dagger.module

import dagger.Module
import dagger.Provides
import net.sgonzalez.kplayground.instrumentation.okhttp.interceptor.AuthorizationInterceptor
import net.sgonzalez.kplayground.instrumentation.retrofit.OAuthService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

@Module class RestModule @Inject constructor() {
  @Provides fun provideOkHttpClient(): OkHttpClient {
    val httpLoggingInterceptor = HttpLoggingInterceptor()
    httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
    val authorizationInterceptor = AuthorizationInterceptor()
    return OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).addInterceptor(authorizationInterceptor).build()
  }

  @Provides fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder().baseUrl("https://api.twitter.com/").client(okHttpClient).addConverterFactory(
        GsonConverterFactory.create()).build()
  }

  @Provides fun provideOauthService(retrofit: Retrofit): OAuthService {
    return retrofit.create(OAuthService::class.java)
  }
}
