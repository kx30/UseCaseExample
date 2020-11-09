package com.example.usecaseexample.activities

import moxy.MvpView
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType

interface MainView : MvpView {

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showSomeFragment()
}