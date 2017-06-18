package net.sgonzalez.kplayground.instrumentation.retrofit

import net.sgonzalez.kplayground.data.response.ComicsV1Response
import retrofit2.Call
import retrofit2.http.GET

interface MarvelService {
  @GET("v1/public/comics") fun comicsV1(): Call<ComicsV1Response>
}
