package net.sgonzalez.kplayground.instrumentation.okhttp.interceptor

import net.sgonzalez.kplayground.domain.encodedConsumerKeySecret
import okhttp3.Interceptor
import okhttp3.Interceptor.Chain
import okhttp3.Response

class AuthorizationInterceptor : Interceptor {
    override fun intercept(chain: Chain): Response {
        return chain.proceed(chain.request().newBuilder().addHeader("Authorization", "Basic $encodedConsumerKeySecret").build())
    }
}