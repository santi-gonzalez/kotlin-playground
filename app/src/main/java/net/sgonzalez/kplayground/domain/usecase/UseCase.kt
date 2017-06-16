package net.sgonzalez.kplayground.domain.usecase

import net.sgonzalez.kplayground.domain.execution.UiThreadExecutor
import net.sgonzalez.kplayground.domain.execution.WorkerThreadExecutor
import javax.inject.Inject

abstract class UseCase<T> {
  @Inject lateinit var uiThreadExecutor: UiThreadExecutor
  @Inject lateinit var workerThreadExecutor: WorkerThreadExecutor

  fun launch() {
    workerThreadExecutor.execute {
      val result = work()
      uiThreadExecutor.execute {
        answer(result)
      }
    }
  }

  abstract fun work(): T

  abstract fun answer(result: T)
}