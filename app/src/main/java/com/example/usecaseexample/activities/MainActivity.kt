package com.example.usecaseexample.activities

import android.os.Bundle
import com.example.usecaseexample.R
import com.example.usecaseexample.fragments.some.SomeFragment
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

class MainActivity : MvpAppCompatActivity(), MainView {

    @InjectPresenter
    lateinit var presenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showSomeFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, SomeFragment())
            .commit()
    }
}