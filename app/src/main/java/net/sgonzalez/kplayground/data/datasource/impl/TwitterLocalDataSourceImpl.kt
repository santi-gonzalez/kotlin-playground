package net.sgonzalez.kplayground.data.datasource.impl

import net.sgonzalez.kplayground.data.datasource.TwitterLocalDataSource
import net.sgonzalez.kplayground.instrumentation.retrofit.service.OAuthService
import javax.inject.Inject

class TwitterLocalDataSourceImpl @Inject constructor(val oAuthService: OAuthService) : TwitterLocalDataSource {
    override fun authenticate(): String {
        println("authenticate")
        try {
//            val token = oAuthService.authenticate().execute().body()?.accessToken
            val execute = oAuthService.authenticate().execute()
            val token = execute.body()?.accessToken
            println("token $token")
            return token ?: throw RuntimeException()
        } catch (exception: Exception) {
            exception.printStackTrace()
            return ""
        }
    }

    override fun mockTask(mockText: String): String {
        return mockText
    }
}