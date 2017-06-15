package net.sgonzalez.kplayground.data.repository

interface TwitterRepository : Repository {
  fun authenticate(): String
  fun mockTask(mockText: String): String
}