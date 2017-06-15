package net.sgonzalez.kplayground.instrumentation.retrofit.service

import net.sgonzalez.kplayground.data.response.InvalidateTokenResponse
import net.sgonzalez.kplayground.data.response.OAuthResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface OAuthService {
  @GET("oauth2/token?grant_type=client_credentials")
  fun authenticate(): Call<OAuthResponse>

  @POST("oauth2/invalidate_token")
  @FormUrlEncoded
  fun invalidateToken(@Field(value = "access_token") accessToken: String): Call<InvalidateTokenResponse>
}