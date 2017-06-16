package net.sgonzalez.kplayground.data.datasource

import net.sgonzalez.kplayground.data.response.OAuthResponse

interface TwitterCloudDataSource : DataSource {
  fun authenticate(): OAuthResponse
}
