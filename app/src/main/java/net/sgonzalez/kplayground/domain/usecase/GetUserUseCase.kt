package net.sgonzalez.kplayground.domain.usecase

abstract class GetUserUseCase : UseCase<Unit>() {
  abstract fun ask(onResult: (String) -> Unit)
}
