package net.sgonzalez.kplayground.instrumentation.dagger.module

import dagger.Module
import dagger.Provides
import net.sgonzalez.kplayground.android.App
import net.sgonzalez.kplayground.instrumentation.dagger.scope.AppScope

@Module
class AndroidModule(private val app: App) {
  @Provides
  @AppScope
  fun provideApp(): App {
    return app
  }
}