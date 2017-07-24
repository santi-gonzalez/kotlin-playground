package net.sgonzalez.kplayground.domain.usecase

import net.sgonzalez.kplayground.domain.model.Comic

abstract class GetComicsUseCase : UseCase<List<Comic>>() {
  abstract fun ask(onResult: (List<Comic>) -> Unit)
}
