package net.sgonzalez.kplayground.domain.execution

import android.os.Handler
import android.os.Looper
import net.sgonzalez.kplayground.instrumentation.dagger.scope.AppScope
import java.util.concurrent.Executor
import javax.inject.Inject

@AppScope
class UiThreadExecutor @Inject constructor() : Executor {
  private var handler: Handler = Handler(Looper.getMainLooper())

  override fun execute(task: Runnable) {
    handler.post(task)
  }
}