package net.sgonzalez.kplayground.instrumentation.dagger.module

import dagger.Module
import dagger.Provides
import net.sgonzalez.kplayground.domain.usecase.AuthenticateUseCase
import net.sgonzalez.kplayground.domain.usecase.GetTimeLineUseCase
import net.sgonzalez.kplayground.domain.usecase.impl.AuthenticateUseCaseImpl
import net.sgonzalez.kplayground.domain.usecase.impl.GetTimeLineUseCaseImpl

@Module()
class UseCaseModule {
    @Provides
    fun provideAuthenticateLineUseCase(useCase: AuthenticateUseCaseImpl): AuthenticateUseCase {
        return useCase
    }

    @Provides
    fun provideGetTimeLineUseCase(useCase: GetTimeLineUseCaseImpl): GetTimeLineUseCase {
        return useCase
    }
}