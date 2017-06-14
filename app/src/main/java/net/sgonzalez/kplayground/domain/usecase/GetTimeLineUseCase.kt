package net.sgonzalez.kplayground.domain.usecase

abstract class GetTimeLineUseCase : UseCase() {
  abstract fun <T> execute(onResult: () -> T)
}