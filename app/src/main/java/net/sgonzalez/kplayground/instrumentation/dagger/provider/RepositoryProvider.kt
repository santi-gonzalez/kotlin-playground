package net.sgonzalez.kplayground.instrumentation.dagger.provider

import net.sgonzalez.kplayground.data.repository.MarvelRepository

interface RepositoryProvider {
  fun getMarvelRepository(): MarvelRepository
}
