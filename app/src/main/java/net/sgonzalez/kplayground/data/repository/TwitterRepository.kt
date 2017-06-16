package net.sgonzalez.kplayground.data.repository

import net.sgonzalez.kplayground.data.response.OAuthResponse

interface TwitterRepository : Repository {
  fun authenticate(): OAuthResponse
  fun mockTask(mockText: String): String
}
