package net.sgonzalez.kplayground.domain.usecase

import net.sgonzalez.kplayground.data.response.ComicsV1Response

abstract class GetComicsUseCase : UseCase<ComicsV1Response>() {
  abstract fun ask(onResult: (ComicsV1Response) -> Unit)
}
