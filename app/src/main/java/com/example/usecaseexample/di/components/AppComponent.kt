package com.example.usecaseexample.di.components

import com.example.usecaseexample.di.modules.UseCaseModule
import com.example.usecaseexample.fragments.some.SomePresenter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UseCaseModule::class])
interface AppComponent {

    fun provideSomePresenter(): SomePresenter
}

