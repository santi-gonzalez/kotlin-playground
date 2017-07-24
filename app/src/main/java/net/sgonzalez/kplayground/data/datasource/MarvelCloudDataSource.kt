package net.sgonzalez.kplayground.data.datasource

import net.sgonzalez.kplayground.domain.model.Comic

interface MarvelCloudDataSource : DataSource {
  fun getComics(): List<Comic>
}
