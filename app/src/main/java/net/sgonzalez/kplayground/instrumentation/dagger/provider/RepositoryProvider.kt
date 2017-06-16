package net.sgonzalez.kplayground.instrumentation.dagger.provider

import net.sgonzalez.kplayground.data.repository.TwitterRepository

interface RepositoryProvider {
  fun getTwitterRepository(): TwitterRepository
}