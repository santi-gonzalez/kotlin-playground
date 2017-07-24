package net.sgonzalez.kplayground.data.datasource.impl

import net.sgonzalez.kplayground.data.datasource.AbsRetrofitDataSource
import net.sgonzalez.kplayground.data.datasource.MarvelCloudDataSource
import net.sgonzalez.kplayground.domain.model.Comic
import net.sgonzalez.kplayground.instrumentation.retrofit.MarvelService
import javax.inject.Inject

class MarvelCloudDataSourceImpl @Inject constructor(val marvelService: MarvelService) : AbsRetrofitDataSource(), MarvelCloudDataSource {
  override fun getComics(): List<Comic> {
    val response = request(marvelService.comicsV1())
    return response.data.results.map { it.toModel() }
  }
}
