package net.sgonzalez.kplayground.data.datasource.impl

import net.sgonzalez.kplayground.data.datasource.TwitterLocalDataSource
import net.sgonzalez.kplayground.instrumentation.retrofit.service.OAuthService
import javax.inject.Inject

class TwitterLocalDataSourceImpl @Inject constructor(val oAuthService: OAuthService) : TwitterLocalDataSource {
  override fun authenticate(): String {
    return oAuthService.authenticate().execute().body()?.accessToken ?: throw RuntimeException()
  }

  override fun mockTask(mockText: String): String {
    return mockText
  }
}