package net.sgonzalez.kplayground.presentation.ui

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.widget.Toolbar
import android.widget.Toast
import net.sgonzalez.kplayground.R
import net.sgonzalez.kplayground.instrumentation.dagger.component.UiComponent
import net.sgonzalez.kplayground.instrumentation.extensions.showToast
import net.sgonzalez.kplayground.presentation.presenter.MainPresenter
import net.sgonzalez.kplayground.presentation.presenter.MainPresenter.View
import javax.inject.Inject

class MainActivity : BaseActivity(), View {
  @Inject lateinit var mainPresenter: MainPresenter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val toolbar = findViewById(R.id.toolbar) as Toolbar
    setSupportActionBar(toolbar)
    val fab = findViewById(R.id.fab) as FloatingActionButton
    fab.setOnClickListener { _ -> mainPresenter.doMockAction() }
  }

  override fun onDaggerInject(uiComponent: UiComponent) {
    uiComponent.inject(this)
  }

  override fun onAttachView() {
    mainPresenter.attachView(this)
  }

  override fun onDetachView() {
    mainPresenter.detachView()
  }

  override fun toast(text: String) {
    showToast(this, text)
  }
}
