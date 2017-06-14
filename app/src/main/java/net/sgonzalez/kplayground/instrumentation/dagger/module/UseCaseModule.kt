package net.sgonzalez.kplayground.instrumentation.dagger.module

import dagger.Module
import dagger.Provides
import net.sgonzalez.kplayground.domain.usecase.GetTimeLineUseCase
import net.sgonzalez.kplayground.domain.usecase.impl.GetTimeLineUseCaseImpl

@Module()
class UseCaseModule {
  @Provides
  fun provideGetTimeLineUseCase(useCase: GetTimeLineUseCaseImpl): GetTimeLineUseCase {
    return useCase
  }
}