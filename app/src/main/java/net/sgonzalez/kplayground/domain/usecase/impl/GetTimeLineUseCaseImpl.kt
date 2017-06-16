package net.sgonzalez.kplayground.domain.usecase.impl

import net.sgonzalez.kplayground.data.repository.TwitterRepository
import net.sgonzalez.kplayground.domain.usecase.GetTimeLineUseCase
import javax.inject.Inject

class GetTimeLineUseCaseImpl @Inject constructor(val twitterRepository: TwitterRepository) : GetTimeLineUseCase() {
  lateinit private var onResult: (String) -> Unit
  lateinit private var mockText: String

  override fun ask(mockText: String,
                       onResult: (String) -> Unit) {
    this.onResult = onResult
    this.mockText = mockText
    launch()
  }

  override fun work(): String {
      println("on work")
    return twitterRepository.authenticate()
//      return twitterRepository.mockTask(mockText)
  }

  override fun answer(result: String) {
      println("on answer")
    onResult.invoke(result)
  }
}