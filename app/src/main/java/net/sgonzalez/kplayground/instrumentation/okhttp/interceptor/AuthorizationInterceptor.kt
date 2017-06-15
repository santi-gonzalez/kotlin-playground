package net.sgonzalez.kplayground.instrumentation.okhttp.interceptor

import net.sgonzalez.kplayground.domain.consumerKeySecret
import okhttp3.Interceptor
import okhttp3.Interceptor.Chain
import okhttp3.Response
import java.security.MessageDigest

class AuthorizationInterceptor : Interceptor {
  private val token: String? = null
    get() {
      if (field == null) {
        field = createToken()
      }
      return field
    }

  private fun createToken(): String? {
    return MessageDigest.getInstance("MD5").digest(consumerKeySecret.toByteArray()).toString()
  }

  override fun intercept(chain: Chain): Response {
    return chain.proceed(chain.request().newBuilder().addHeader("Authorization", "Basic $token").build())
  }
}