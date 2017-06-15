package net.sgonzalez.kplayground.instrumentation.dagger.module

import dagger.Module
import dagger.Provides
import net.sgonzalez.kplayground.instrumentation.retrofit.service.OAuthService
import retrofit2.Retrofit
import javax.inject.Inject

@Module
class RestModule @Inject constructor() {
  @Provides
  fun provideRetrofit(): Retrofit {
    return Retrofit.Builder().baseUrl("https://api.twitter.com/").build()
  }

  @Provides
  fun provideOauthService(retrofit: Retrofit): OAuthService {
    return retrofit.create(OAuthService::class.java)
  }
}