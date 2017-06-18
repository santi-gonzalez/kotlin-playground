package net.sgonzalez.kplayground.domain.usecase.impl

import net.sgonzalez.kplayground.data.repository.MarvelRepository
import net.sgonzalez.kplayground.domain.usecase.GetComicUseCase
import javax.inject.Inject

class GetComicUseCaseImpl @Inject constructor(val marvelRepository: MarvelRepository) : GetComicUseCase() {
  lateinit private var onResult: (String) -> Unit
  lateinit private var comicId: String

  override fun ask(comicId: String,
                   onResult: (String) -> Unit) {
    this.onResult = onResult
    this.comicId = comicId
    launch()
  }

  override fun work(): String {
    println("on work")
    return marvelRepository.getComic(comicId)
  }

  override fun answer(result: String) {
    println("on answer")
    onResult.invoke(result)
  }
}
