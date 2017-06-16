package net.sgonzalez.kplayground.instrumentation.dagger.provider

import net.sgonzalez.kplayground.domain.usecase.AuthenticateUseCase
import net.sgonzalez.kplayground.domain.usecase.GetTimeLineUseCase

interface UseCaseProvider {
    fun getAuthenticateUseCase(): AuthenticateUseCase
    fun getTimeLineUseCase(): GetTimeLineUseCase
}