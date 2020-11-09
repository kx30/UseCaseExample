package com.example.usecaseexample.fragments.some

import android.util.Log
import com.example.domain.usecases.books.BooksUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.schedulers.Schedulers
import moxy.InjectViewState
import moxy.MvpPresenter
import javax.inject.Inject

@InjectViewState
class SomePresenter @Inject constructor(
    private val booksUseCase: BooksUseCase
) : MvpPresenter<SomeView>() {

    private val compositeDisposable = CompositeDisposable()

    fun onButtonClicked() {
        booksUseCase.invoke()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                it.forEach { model ->
                    Log.d(TAG, "onButtonClicked: ${model.name} : is added to cart : ${model.isAddedToBasket}")
                }
            }, {
                viewState.showError(it.localizedMessage.toString())
            })
            .addTo(compositeDisposable)
    }

    companion object {
        private const val TAG = "SomePresenter"
    }
}