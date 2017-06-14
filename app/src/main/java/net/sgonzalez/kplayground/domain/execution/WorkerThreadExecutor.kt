package net.sgonzalez.kplayground.domain.execution

import net.sgonzalez.kplayground.instrumentation.dagger.scope.AppScope
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import javax.inject.Inject

@AppScope
class WorkerThreadExecutor @Inject constructor() : Executor {
  private var cachedThreadPool: ExecutorService = Executors.newCachedThreadPool()

  override fun execute(task: Runnable) {
    cachedThreadPool.submit(task)
  }
}