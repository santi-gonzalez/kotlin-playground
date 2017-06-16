package net.sgonzalez.kplayground.domain.usecase

import net.sgonzalez.kplayground.data.response.OAuthResponse

abstract class AuthenticateUseCase : UseCase<OAuthResponse>() {
  abstract fun ask(onResult: (OAuthResponse) -> Unit)
}
