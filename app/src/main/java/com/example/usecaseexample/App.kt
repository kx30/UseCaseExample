package com.example.usecaseexample

import android.app.Application
import com.example.usecaseexample.di.components.AppComponent
import com.example.usecaseexample.di.components.DaggerAppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent
            .builder()
            .build()
    }


    companion object {
        lateinit var appComponent: AppComponent
    }
}