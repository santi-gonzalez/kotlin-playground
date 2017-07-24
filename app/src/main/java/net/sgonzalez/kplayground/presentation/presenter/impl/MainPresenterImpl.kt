package net.sgonzalez.kplayground.presentation.presenter.impl

import net.sgonzalez.kplayground.domain.usecase.GetComicsUseCase
import net.sgonzalez.kplayground.domain.usecase.GetComicUseCase
import net.sgonzalez.kplayground.presentation.presenter.MainPresenter
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(val getComicsUseCase: GetComicsUseCase,
                                            val getComicUseCase: GetComicUseCase) : MainPresenter() {
  override fun doMockAction() {
    getComicsUseCase.ask {
      println(it)
    }
//        getComicUseCase.ask("Hello world") {}
  }
}
