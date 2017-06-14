package net.sgonzalez.kplayground.presentation.presenter.impl

import net.sgonzalez.kplayground.domain.usecase.GetTimeLineUseCase
import net.sgonzalez.kplayground.presentation.presenter.MainPresenter
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(private var getTimeLineUseCase: GetTimeLineUseCase,
                                            private var getTimeLineUseCase2: GetTimeLineUseCase) : MainPresenter() {
  override fun doMockAction() {
    getTimeLineUseCase.execute {
      view?.toast("finished!")
    }
    getTimeLineUseCase.execute {
    }
  }
}