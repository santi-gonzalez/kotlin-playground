package net.sgonzalez.kplayground.data.datasource.impl

import net.sgonzalez.kplayground.data.datasource.RetrofitDataSource
import net.sgonzalez.kplayground.data.datasource.TwitterCloudDataSource
import net.sgonzalez.kplayground.data.response.OAuthResponse
import net.sgonzalez.kplayground.instrumentation.retrofit.service.OAuthService
import javax.inject.Inject

class TwitterCloudDataSourceImpl @Inject constructor(val oAuthService: OAuthService) : RetrofitDataSource(), TwitterCloudDataSource {
  override fun authenticate(): OAuthResponse {
    return request(oAuthService.authenticate())!!
  }
}
