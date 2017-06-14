package net.sgonzalez.kplayground.android

import android.app.Application
import net.sgonzalez.kplayground.instrumentation.dagger.component.AppComponent
import net.sgonzalez.kplayground.instrumentation.dagger.component.DaggerAppComponent
import net.sgonzalez.kplayground.instrumentation.dagger.module.ApplicationModule

class App : Application() {
  val appComponent: AppComponent by lazy {
    DaggerAppComponent.builder().applicationModule(ApplicationModule(this)).build()
  }

  companion object {
    @JvmStatic lateinit var instance: App
      private set
  }

  override fun onCreate() {
    super.onCreate()
    instance = this
    appComponent.inject(this)
  }
}