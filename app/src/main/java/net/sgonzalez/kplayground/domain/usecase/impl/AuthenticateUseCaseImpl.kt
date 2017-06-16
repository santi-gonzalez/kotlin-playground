package net.sgonzalez.kplayground.domain.usecase.impl

import net.sgonzalez.kplayground.data.repository.TwitterRepository
import net.sgonzalez.kplayground.data.response.OAuthResponse
import net.sgonzalez.kplayground.domain.usecase.AuthenticateUseCase
import javax.inject.Inject

class AuthenticateUseCaseImpl @Inject constructor(val twitterRepository: TwitterRepository) : AuthenticateUseCase() {
  lateinit private var onResult: (OAuthResponse) -> Unit

  override fun ask(onResult: (OAuthResponse) -> Unit) {
    this.onResult = onResult
    launch()
  }

  override fun work(): OAuthResponse {
    println("on work")
    return twitterRepository.authenticate()
  }

  override fun answer(result: OAuthResponse) {
    println("on answer")
    onResult.invoke(result)
  }
}
