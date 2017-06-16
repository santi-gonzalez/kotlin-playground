package net.sgonzalez.kplayground.instrumentation.dagger.module

import dagger.Module
import dagger.Provides
import net.sgonzalez.kplayground.data.datasource.TwitterLocalDataSource
import net.sgonzalez.kplayground.data.datasource.impl.TwitterLocalDataSourceImpl

@Module
class DataSourceModule {
  @Provides
  fun provideTwitterLocalDataSource(dataSource: TwitterLocalDataSourceImpl): TwitterLocalDataSource {
    return dataSource
  }
}