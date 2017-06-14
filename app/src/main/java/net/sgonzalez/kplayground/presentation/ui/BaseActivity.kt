package net.sgonzalez.kplayground.presentation.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import net.sgonzalez.kplayground.instrumentation.dagger.component.DaggerUiComponent
import net.sgonzalez.kplayground.instrumentation.dagger.component.UiComponent
import net.sgonzalez.kplayground.instrumentation.dagger.module.ActivityModule
import net.sgonzalez.kplayground.instrumentation.extensions.appComponent

abstract class BaseActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    onDaggerInject(DaggerUiComponent.builder().appComponent(appComponent()).activityModule(ActivityModule(this)).build())
  }

  abstract fun onDaggerInject(uiComponent: UiComponent)

  override fun onStart() {
    super.onStart()
    onAttachView()
  }

  abstract fun onAttachView()

  override fun onStop() {
    super.onStop()
    onDetachView()
  }

  abstract fun onDetachView()
}
