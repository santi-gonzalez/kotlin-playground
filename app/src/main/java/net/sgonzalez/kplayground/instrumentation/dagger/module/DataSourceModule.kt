package net.sgonzalez.kplayground.instrumentation.dagger.module

import dagger.Module
import dagger.Provides
import net.sgonzalez.kplayground.data.datasource.MarvelCloudDataSource
import net.sgonzalez.kplayground.data.datasource.MarvelLocalDataSource
import net.sgonzalez.kplayground.data.datasource.impl.MarvelCloudDataSourceImpl
import net.sgonzalez.kplayground.data.datasource.impl.MarvelLocalDataSourceImpl

@Module class DataSourceModule {
  @Provides fun provideMarvelLocalDataSource(dataSource: MarvelLocalDataSourceImpl): MarvelLocalDataSource {
    return dataSource
  }

  @Provides fun provideMarvelCloudDataSource(dataSource: MarvelCloudDataSourceImpl): MarvelCloudDataSource {
    return dataSource
  }
}
