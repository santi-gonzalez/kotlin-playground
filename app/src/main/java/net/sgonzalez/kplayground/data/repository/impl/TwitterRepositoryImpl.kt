package net.sgonzalez.kplayground.data.repository.impl

import net.sgonzalez.kplayground.data.datasource.TwitterCloudDataSource
import net.sgonzalez.kplayground.data.datasource.TwitterLocalDataSource
import net.sgonzalez.kplayground.data.repository.TwitterRepository
import javax.inject.Inject

class TwitterRepositoryImpl @Inject constructor(val twitterLocalDataSource: TwitterLocalDataSource,
                                                val twitterCloudDataSource: TwitterCloudDataSource) : TwitterRepository {
    override fun authenticate(): String {
        println("authenticate")
        return twitterCloudDataSource.authenticate()
    }

    override fun mockTask(mockText: String): String {
        return twitterLocalDataSource.mockTask(mockText)
    }
}