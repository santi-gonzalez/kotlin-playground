package net.sgonzalez.kplayground.data.repository.impl

import net.sgonzalez.kplayground.data.datasource.TwitterLocalDataSource
import net.sgonzalez.kplayground.data.repository.TwitterRepository
import javax.inject.Inject

class TwitterRepositoryImpl @Inject constructor(val twitterLocalDataSource: TwitterLocalDataSource) : TwitterRepository {
  override fun mockTask(mockText: String): String {
    return twitterLocalDataSource.mockTask(mockText)
  }
}