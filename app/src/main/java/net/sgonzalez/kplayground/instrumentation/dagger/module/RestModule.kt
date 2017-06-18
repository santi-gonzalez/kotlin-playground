package net.sgonzalez.kplayground.instrumentation.dagger.module

import dagger.Module
import dagger.Provides
import net.sgonzalez.kplayground.instrumentation.okhttp.interceptor.AuthenticationInterceptor
import net.sgonzalez.kplayground.instrumentation.retrofit.MarvelService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

private const val ENDPOINT = "https://gateway.marvel.com/"

@Module class RestModule @Inject constructor() {
  @Provides fun provideOkHttpClient(): OkHttpClient {
    val httpLoggingInterceptor = HttpLoggingInterceptor()
    httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
    return OkHttpClient.Builder().addInterceptor(AuthenticationInterceptor()).addInterceptor(httpLoggingInterceptor).build()
  }

  @Provides fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder().baseUrl(ENDPOINT).client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).build()
  }

  @Provides fun provideMarvelService(retrofit: Retrofit): MarvelService {
    return retrofit.create(MarvelService::class.java)
  }
}
