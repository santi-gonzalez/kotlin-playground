package net.sgonzalez.kplayground.domain.usecase

abstract class AuthenticateUseCase : UseCase<String>() {
  abstract fun ask(onResult: (String) -> Unit)
}