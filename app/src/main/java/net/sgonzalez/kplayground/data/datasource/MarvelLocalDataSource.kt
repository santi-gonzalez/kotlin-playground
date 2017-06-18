package net.sgonzalez.kplayground.data.datasource

interface MarvelLocalDataSource : DataSource {
  fun getComic(comicId: String): String
}
