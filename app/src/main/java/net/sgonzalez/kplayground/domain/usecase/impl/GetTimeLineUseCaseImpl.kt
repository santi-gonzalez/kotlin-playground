package net.sgonzalez.kplayground.domain.usecase.impl

import net.sgonzalez.kplayground.data.repository.TwitterRepository
import net.sgonzalez.kplayground.domain.usecase.GetTimeLineUseCase
import javax.inject.Inject

class GetTimeLineUseCaseImpl @Inject constructor(val twitterRepository: TwitterRepository) : GetTimeLineUseCase() {
  override fun <T> execute(onResult: () -> T) {
    println(twitterRepository)
    workerThreadExecutor.execute {
      onResult.invoke()
    }
  }
}