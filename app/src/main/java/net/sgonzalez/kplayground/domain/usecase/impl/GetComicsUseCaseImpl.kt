package net.sgonzalez.kplayground.domain.usecase.impl

import net.sgonzalez.kplayground.data.repository.MarvelRepository
import net.sgonzalez.kplayground.data.response.ComicsV1Response
import net.sgonzalez.kplayground.domain.usecase.GetComicsUseCase
import javax.inject.Inject

class GetComicsUseCaseImpl @Inject constructor(val marvelRepository: MarvelRepository) : GetComicsUseCase() {
  lateinit private var onResult: (ComicsV1Response) -> Unit

  override fun ask(onResult: (ComicsV1Response) -> Unit) {
    this.onResult = onResult
    launch()
  }

  override fun work(): ComicsV1Response {
    println("on work")
    return marvelRepository.getComics()
  }

  override fun answer(result: ComicsV1Response) {
    println("on answer")
    onResult.invoke(result)
  }
}
