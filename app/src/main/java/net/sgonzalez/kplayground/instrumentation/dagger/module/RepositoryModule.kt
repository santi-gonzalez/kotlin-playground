package net.sgonzalez.kplayground.instrumentation.dagger.module

import dagger.Module
import dagger.Provides
import net.sgonzalez.kplayground.data.repository.MarvelRepository
import net.sgonzalez.kplayground.data.repository.impl.MarvelRepositoryImpl

@Module class RepositoryModule {
  @Provides fun provideMarvelRepository(repository: MarvelRepositoryImpl): MarvelRepository {
    return repository
  }
}
