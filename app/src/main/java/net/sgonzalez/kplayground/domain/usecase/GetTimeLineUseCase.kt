package net.sgonzalez.kplayground.domain.usecase

abstract class GetTimeLineUseCase : UseCase<String>() {
  abstract fun ask(mockText: String, onResult: (String) -> Unit)
}