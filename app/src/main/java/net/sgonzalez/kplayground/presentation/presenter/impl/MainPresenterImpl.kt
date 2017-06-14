package net.sgonzalez.kplayground.presentation.presenter.impl

import net.sgonzalez.kplayground.domain.usecase.GetTimeLineUseCase
import net.sgonzalez.kplayground.presentation.presenter.MainPresenter
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(private var getTimeLineUseCase: GetTimeLineUseCase) : MainPresenter() {
  override fun doMockAction() {
    getTimeLineUseCase.execute("Hello world") { text -> view?.toast(text) }
  }
}