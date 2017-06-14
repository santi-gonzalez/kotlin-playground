package net.sgonzalez.kplayground.instrumentation.dagger.provider

import net.sgonzalez.kplayground.domain.usecase.GetTimeLineUseCase

interface UseCaseProvider {
  fun getTimeLineUseCase(): GetTimeLineUseCase
}