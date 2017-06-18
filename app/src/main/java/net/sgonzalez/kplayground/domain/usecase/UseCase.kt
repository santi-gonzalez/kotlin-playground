package net.sgonzalez.kplayground.domain.usecase

import net.sgonzalez.kplayground.domain.execution.UiThreadExecutor
import net.sgonzalez.kplayground.domain.execution.WorkerThreadExecutor
import javax.inject.Inject

abstract class UseCase<T>(open var error: ((Throwable) -> Unit)? = null) {
  @Inject lateinit var workerThreadExecutor: WorkerThreadExecutor
  @Inject lateinit var uiThreadExecutor: UiThreadExecutor

  fun launch() {
    launchOnWorkerThread {
      try {
        val result = work()
        launchOnUiThread {
          answer(result)
        }
      } catch (throwable: Throwable) {
        logError(throwable, "exception raised while working:")
        launchOnUiThread {
          error(throwable)
        }
      }
    }
  }

  private fun launchOnWorkerThread(block: () -> Unit) {
    workerThreadExecutor.execute(block)
  }

  private fun launchOnUiThread(block: () -> Unit) {
    uiThreadExecutor.execute(block)
  }

  private fun logError(throwable: Throwable,
                       message: String? = null) {
    println(message)
    throwable.printStackTrace()
  }

  abstract fun work(): T

  abstract fun answer(result: T)

  open fun error(throwable: Throwable) {
    error?.invoke(throwable)
  }
}
