package com.example.usecaseexample.activities

import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class MainPresenter: MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.showSomeFragment()
    }
}