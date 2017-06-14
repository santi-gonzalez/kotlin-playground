package net.sgonzalez.kplayground.instrumentation.dagger.module

import dagger.Module
import dagger.Provides
import net.sgonzalez.kplayground.data.repository.TwitterRepository
import net.sgonzalez.kplayground.data.repository.impl.TwitterRepositoryImpl

@Module
class RepositoryModule {
  @Provides
  fun provideTwitterRepository(repository: TwitterRepositoryImpl): TwitterRepository {
    return repository
  }
}