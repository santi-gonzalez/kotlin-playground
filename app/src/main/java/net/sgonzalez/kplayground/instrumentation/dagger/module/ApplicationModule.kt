package net.sgonzalez.kplayground.instrumentation.dagger.module

import dagger.Module
import dagger.Provides
import net.sgonzalez.kplayground.instrumentation.android.App

@Module class ApplicationModule(private val app: App) {
  @Provides fun provideApp(): App {
    return app
  }
}
