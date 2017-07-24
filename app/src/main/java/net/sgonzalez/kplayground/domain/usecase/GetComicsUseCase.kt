package net.sgonzalez.kplayground.domain.usecase

import net.sgonzalez.kplayground.domain.model.ComicModel

abstract class GetComicsUseCase : UseCase<List<ComicModel>>() {
  abstract fun ask(onResult: (List<ComicModel>) -> Unit)
}
