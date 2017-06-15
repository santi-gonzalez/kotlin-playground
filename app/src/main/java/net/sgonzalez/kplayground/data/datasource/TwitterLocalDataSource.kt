package net.sgonzalez.kplayground.data.datasource

interface TwitterLocalDataSource : DataSource {
  fun authenticate(): String
  fun mockTask(mockText: String): String
}