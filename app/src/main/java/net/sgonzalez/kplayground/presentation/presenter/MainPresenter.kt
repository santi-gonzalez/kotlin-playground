package net.sgonzalez.kplayground.presentation.presenter

abstract class MainPresenter : Presenter<MainPresenter.View>() {
  abstract fun doMockAction()

  interface View : Presenter.KView {
    fun toast(text: String)
  }
}