package net.sgonzalez.kplayground.data.datasource.impl

import net.sgonzalez.kplayground.data.datasource.TwitterLocalDataSource
import javax.inject.Inject

class TwitterLocalDataSourceImpl @Inject constructor() : TwitterLocalDataSource {
  override fun mockTask(mockText: String): String {
    return mockText
  }
}
