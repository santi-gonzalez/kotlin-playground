package net.sgonzalez.kplayground.domain.usecase

import net.sgonzalez.kplayground.domain.execution.UiThreadExecutor
import net.sgonzalez.kplayground.domain.execution.WorkerThreadExecutor
import javax.inject.Inject

abstract class UseCase<T> {
  @Inject lateinit var workerThreadExecutor: WorkerThreadExecutor
  @Inject lateinit var uiThreadExecutor: UiThreadExecutor

  fun launch() {
    workerThreadExecutor.execute {
      try {
        val result = work()
        uiThreadExecutor.execute {
          answer(result)
        }
      } catch (exception: Exception) {
        logError(exception, "exception raised while working:")
      }
    }
  }

  private fun logError(exception: Exception,
                       message: String? = null) {
    println(message)
    exception.printStackTrace()
  }

  abstract fun work(): T

  abstract fun answer(result: T)
}
