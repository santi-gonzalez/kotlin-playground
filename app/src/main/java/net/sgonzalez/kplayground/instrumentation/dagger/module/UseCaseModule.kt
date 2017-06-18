package net.sgonzalez.kplayground.instrumentation.dagger.module

import dagger.Module
import dagger.Provides
import net.sgonzalez.kplayground.domain.usecase.GetComicsUseCase
import net.sgonzalez.kplayground.domain.usecase.GetComicUseCase
import net.sgonzalez.kplayground.domain.usecase.impl.GetComicsUseCaseImpl
import net.sgonzalez.kplayground.domain.usecase.impl.GetComicUseCaseImpl

@Module() class UseCaseModule {
  @Provides fun provideGetComicsUseCase(useCase: GetComicsUseCaseImpl): GetComicsUseCase {
    return useCase
  }

  @Provides fun provideGetComicUseCase(useCase: GetComicUseCaseImpl): GetComicUseCase {
    return useCase
  }
}
