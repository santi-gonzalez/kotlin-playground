package net.sgonzalez.kplayground.data.repository

interface TwitterRepository : Repository {
  fun mockTask(mockText: String): String
}