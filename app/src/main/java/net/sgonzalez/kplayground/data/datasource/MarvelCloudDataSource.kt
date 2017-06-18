package net.sgonzalez.kplayground.data.datasource

import net.sgonzalez.kplayground.data.response.ComicsV1Response

interface MarvelCloudDataSource : DataSource {
  fun getComics(): ComicsV1Response
}
