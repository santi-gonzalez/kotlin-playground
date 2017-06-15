package net.sgonzalez.kplayground.domain.usecase.impl

import net.sgonzalez.kplayground.data.repository.TwitterRepository
import net.sgonzalez.kplayground.domain.usecase.AuthenticateUseCase

class AuthenticateUseCaseImpl(val twitterRepository: TwitterRepository) : AuthenticateUseCase() {
  lateinit private var onResult: (String) -> Unit

  override fun ask(onResult: (String) -> Unit) {
    this.onResult = onResult
    launch()
  }

  override fun work(): String {
    return twitterRepository.authenticate()
  }

  override fun answer(result: String) {
    onResult.invoke(result)
  }
}