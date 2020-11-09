package com.example.usecaseexample.di.modules

import com.example.domain.gateways.BooksGateway
import com.example.gateway.Api
import com.example.gateway.RetrofitBooksGateway
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ApiModule::class])
class GatewayModule {

    @Provides
    @Singleton
    fun provideBooksGateway(api: Api): BooksGateway =
        RetrofitBooksGateway(api)
}