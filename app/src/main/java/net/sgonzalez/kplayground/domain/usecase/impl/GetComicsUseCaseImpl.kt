package net.sgonzalez.kplayground.domain.usecase.impl

import net.sgonzalez.kplayground.data.repository.MarvelRepository
import net.sgonzalez.kplayground.domain.model.Comic
import net.sgonzalez.kplayground.domain.usecase.GetComicsUseCase
import javax.inject.Inject

class GetComicsUseCaseImpl @Inject constructor(val marvelRepository: MarvelRepository) : GetComicsUseCase() {
  lateinit private var onResult: (List<Comic>) -> Unit

  override fun ask(onResult: (List<Comic>) -> Unit) {
    this.onResult = onResult
    launch()
  }

  override fun work(): List<Comic> {
    println("on work")
    return marvelRepository.getComics()
  }

  override fun answer(result: List<Comic>) {
    println("on answer")
    onResult.invoke(result)
  }
}
