package net.sgonzalez.kplayground.domain.usecase

abstract class GetTimeLineUseCase : UseCase<String>() {
  abstract fun execute(mockText: String, onResult: (String) -> Unit)
}