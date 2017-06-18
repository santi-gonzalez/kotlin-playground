package net.sgonzalez.kplayground.instrumentation.okhttp.interceptor

import net.sgonzalez.kplayground.domain.MARVEL_PRIVATE_KEY
import net.sgonzalez.kplayground.domain.MARVEL_PUBLIC_KEY
import net.sgonzalez.kplayground.instrumentation.java.CryptoUtils
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import org.apache.commons.codec.binary.Hex
import org.apache.commons.codec.digest.DigestUtils

private const val QUERY_PARAM_TS = "ts"
private const val QUERY_PARAM_API_KEY = "apikey"
private const val QUERY_PARAM_HASH = "hash"

class AuthenticationInterceptor : Interceptor {
  override fun intercept(chain: Interceptor.Chain): Response {
    return chain.proceed(generateAuthenticatedRequest(chain))
  }

  private fun generateAuthenticatedRequest(chain: Interceptor.Chain): Request {
    return chain.request().newBuilder().url(addAuthentication(chain)).build()
  }

  private fun addAuthentication(chain: Interceptor.Chain): HttpUrl {
    val (ts, apiKey, hash) = generateAuthentication()
    val urlBuilder = chain.request().url().newBuilder()
    urlBuilder.addQueryParameter(QUERY_PARAM_TS, ts)
    urlBuilder.addQueryParameter(QUERY_PARAM_API_KEY, apiKey)
    urlBuilder.addQueryParameter(QUERY_PARAM_HASH, hash)
    return urlBuilder.build()
  }

  private fun generateAuthentication(): Authentication {
    val ts = System.currentTimeMillis().toString()
    val apiKey = MARVEL_PUBLIC_KEY
    val hash = CryptoUtils.md5(ts + MARVEL_PRIVATE_KEY + apiKey)
    return Authentication(ts, apiKey, hash)
  }

  data class Authentication(val ts: String,
                            val apiKey: String,
                            val hash: String)
}
