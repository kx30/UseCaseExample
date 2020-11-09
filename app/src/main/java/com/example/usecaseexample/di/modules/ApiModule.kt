package com.example.usecaseexample.di.modules

import com.example.gateway.Api
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [RetrofitModule::class])
class ApiModule {

    @Provides
    @Singleton
    fun provideApi(retrofit: Retrofit): Api =
        retrofit.create(Api::class.java)
}