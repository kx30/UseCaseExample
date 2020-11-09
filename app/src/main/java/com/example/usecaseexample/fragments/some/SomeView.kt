package com.example.usecaseexample.fragments.some

import moxy.MvpView
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType

interface SomeView : MvpView {

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showError(message: String)

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showSuccess()
}