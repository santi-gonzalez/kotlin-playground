package net.sgonzalez.kplayground.instrumentation.dagger.module

import android.app.Activity
import dagger.Module
import dagger.Provides
import net.sgonzalez.kplayground.presentation.presenter.MainPresenter
import net.sgonzalez.kplayground.presentation.presenter.impl.MainPresenterImpl

@Module()
class ActivityModule(private val activity: Activity) {
  @Provides
  fun provideActivity(): Activity {
    return activity
  }

  @Provides
  fun provideMainPresenter(presenter: MainPresenterImpl): MainPresenter {
    return presenter
  }
}