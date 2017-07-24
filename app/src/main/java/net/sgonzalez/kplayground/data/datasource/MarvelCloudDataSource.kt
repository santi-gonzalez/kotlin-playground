package net.sgonzalez.kplayground.data.datasource

import net.sgonzalez.kplayground.domain.model.ComicModel

interface MarvelCloudDataSource : DataSource {
  fun getComics(): List<ComicModel>
}
