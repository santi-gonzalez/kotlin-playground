package net.sgonzalez.kplayground.data.repository.impl

import net.sgonzalez.kplayground.data.datasource.MarvelCloudDataSource
import net.sgonzalez.kplayground.data.datasource.MarvelLocalDataSource
import net.sgonzalez.kplayground.data.repository.MarvelRepository
import net.sgonzalez.kplayground.data.response.ComicsV1Response
import javax.inject.Inject

class MarvelRepositoryImpl @Inject constructor(private val marvelLocalDataSource: MarvelLocalDataSource,
                                               private val marvelCloudDataSource: MarvelCloudDataSource) : MarvelRepository {
  override fun getComics(): ComicsV1Response {
    val authenticate = marvelCloudDataSource.getComics()
    return authenticate
  }

  override fun getComic(comicId: String): String {
    return marvelLocalDataSource.getComic(comicId)
  }
}
