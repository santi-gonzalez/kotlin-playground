package net.sgonzalez.kplayground.data.datasource.impl

import net.sgonzalez.kplayground.data.datasource.TwitterCloudDataSource
import net.sgonzalez.kplayground.instrumentation.retrofit.service.OAuthService
import javax.inject.Inject

class TwitterCloudDataSourceImpl @Inject constructor(val oAuthService: OAuthService) : TwitterCloudDataSource {
    override fun authenticate(): String {
        println("authenticate")
        try {
            return oAuthService.authenticate().execute().body()?.accessToken ?: throw RuntimeException()
        } catch (exception: Exception) {
            exception.printStackTrace()
            return ""
        }
    }
}