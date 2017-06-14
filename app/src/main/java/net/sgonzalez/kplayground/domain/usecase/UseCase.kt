package net.sgonzalez.kplayground.domain.usecase

import net.sgonzalez.kplayground.domain.execution.UiThreadExecutor
import net.sgonzalez.kplayground.domain.execution.WorkerThreadExecutor
import javax.inject.Inject

abstract class UseCase {
  @Inject lateinit protected var uiThreadExecutor: UiThreadExecutor
  @Inject lateinit protected var workerThreadExecutor: WorkerThreadExecutor
}