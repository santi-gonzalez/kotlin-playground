package net.sgonzalez.kplayground.domain.usecase

abstract class GetComicUseCase : UseCase<String>() {
  abstract fun ask(comicId: String,
                   onResult: (String) -> Unit)
}
