package net.sgonzalez.kplayground.data.datasource.impl

import net.sgonzalez.kplayground.data.datasource.MarvelLocalDataSource
import javax.inject.Inject

class MarvelLocalDataSourceImpl @Inject constructor() : MarvelLocalDataSource {
  override fun getComic(comicId: String): String {
    return comicId
  }
}
