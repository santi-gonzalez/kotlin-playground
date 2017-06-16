@file:Suppress("unused")

package net.sgonzalez.kplayground.data.datasource

import retrofit2.Call
import retrofit2.HttpException
import retrofit2.Response

abstract class AbsRetrofitDataSource {
  fun <T> request(service: Call<T>): T {
    return requestIntoWrapper(service)!!.body
  }

  fun <T> requestIntoWrapper(service: Call<T>): ResponseWrapper<T>? {
    val response = service.execute()
    if (response.isSuccessful) {
      return ResponseWrapper(response.body()!!, response)
    } else {
      throw HttpException(response)
    }
  }

  data class ResponseWrapper<T>(val body: T,
                                val response: Response<T>)
}
