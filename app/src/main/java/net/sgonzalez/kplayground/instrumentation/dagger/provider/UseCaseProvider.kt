package net.sgonzalez.kplayground.instrumentation.dagger.provider

import net.sgonzalez.kplayground.domain.usecase.GetComicsUseCase
import net.sgonzalez.kplayground.domain.usecase.GetComicUseCase

interface UseCaseProvider {
  fun getAuthenticateUseCase(): GetComicsUseCase
  fun getTimeLineUseCase(): GetComicUseCase
}
