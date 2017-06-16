package net.sgonzalez.kplayground.data.datasource

import retrofit2.Call
import retrofit2.HttpException

abstract class RetrofitDataSource {
  fun <T> request(service: Call<T>): T? {
    val response = service.execute()
    if (response.isSuccessful) {
      return response.body()
    } else {
      throw HttpException(response)
    }
  }
}
