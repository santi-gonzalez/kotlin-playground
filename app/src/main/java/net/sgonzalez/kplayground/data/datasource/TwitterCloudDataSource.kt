package net.sgonzalez.kplayground.data.datasource

interface TwitterCloudDataSource : DataSource {
    fun authenticate(): String
}