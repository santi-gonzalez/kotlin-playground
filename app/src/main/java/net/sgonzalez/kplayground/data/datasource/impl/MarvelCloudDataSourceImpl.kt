package net.sgonzalez.kplayground.data.datasource.impl

import net.sgonzalez.kplayground.data.datasource.AbsRetrofitDataSource
import net.sgonzalez.kplayground.data.datasource.MarvelCloudDataSource
import net.sgonzalez.kplayground.data.response.ComicsV1Response
import net.sgonzalez.kplayground.instrumentation.retrofit.MarvelService
import javax.inject.Inject

class MarvelCloudDataSourceImpl @Inject constructor(val marvelService: MarvelService) : AbsRetrofitDataSource(), MarvelCloudDataSource {
  override fun getComics(): ComicsV1Response {
    return request(marvelService.comicsV1())
  }
}
