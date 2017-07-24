package net.sgonzalez.kplayground.domain.usecase.impl

import net.sgonzalez.kplayground.data.repository.MarvelRepository
import net.sgonzalez.kplayground.domain.model.ComicModel
import net.sgonzalez.kplayground.domain.usecase.GetComicsUseCase
import javax.inject.Inject

class GetComicsUseCaseImpl @Inject constructor(val marvelRepository: MarvelRepository) : GetComicsUseCase() {
  lateinit private var onResult: (List<ComicModel>) -> Unit

  override fun ask(onResult: (List<ComicModel>) -> Unit) {
    this.onResult = onResult
    launch()
  }

  override fun work(): List<ComicModel> {
    println("on work")
    return marvelRepository.getComics()
  }

  override fun answer(result: List<ComicModel>) {
    println("on answer")
    onResult.invoke(result)
  }
}
