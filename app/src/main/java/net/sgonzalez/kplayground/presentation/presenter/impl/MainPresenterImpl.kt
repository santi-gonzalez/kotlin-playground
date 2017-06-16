package net.sgonzalez.kplayground.presentation.presenter.impl

import net.sgonzalez.kplayground.domain.usecase.AuthenticateUseCase
import net.sgonzalez.kplayground.domain.usecase.GetTimeLineUseCase
import net.sgonzalez.kplayground.presentation.presenter.MainPresenter
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(val authenticateUseCase: AuthenticateUseCase,
                                            val getTimeLineUseCase: GetTimeLineUseCase) : MainPresenter() {
    override fun doMockAction() {
//        authenticateUseCase.ask { token -> println(token) }
        getTimeLineUseCase.ask("Hello world") { text -> view?.toast(text) }
    }
}