package net.sgonzalez.kplayground.data.datasource

interface TwitterLocalDataSource : DataSource {
  fun mockTask(mockText: String): String
}