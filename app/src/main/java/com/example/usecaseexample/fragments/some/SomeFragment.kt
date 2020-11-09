package com.example.usecaseexample.fragments.some

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.usecaseexample.App
import com.example.usecaseexample.R
import kotlinx.android.synthetic.main.fragment_some.*
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter

class SomeFragment : MvpAppCompatFragment(), SomeView {

    @InjectPresenter
    lateinit var presenter: SomePresenter


    @ProvidePresenter
    fun providePresenter(): SomePresenter = App.appComponent.provideSomePresenter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_some, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListeners()
    }

    override fun showError(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

    override fun showSuccess() {
        Toast.makeText(requireContext(), "Zhopa!", Toast.LENGTH_SHORT).show()
    }

    private fun setListeners() {
        button.setOnClickListener {
            presenter.onButtonClicked()
        }
    }
}