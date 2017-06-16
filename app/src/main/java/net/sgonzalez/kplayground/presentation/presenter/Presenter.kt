package net.sgonzalez.kplayground.presentation.presenter

abstract class Presenter<V : Presenter.KView> {
  var view: V? = null

  fun attachView(view: V) {
    this.view = view
  }

  fun detachView() {
    view = null
  }

  interface KView
}