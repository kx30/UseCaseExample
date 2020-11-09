package com.example.usecaseexample.di.modules

import com.example.domain.gateways.BooksGateway
import com.example.domain.usecases.books.BooksUseCase
import com.example.domain.usecases.books.BooksUseCaseImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [GatewayModule::class])
class UseCaseModule {

    @Provides
    @Singleton
    fun provideBooksModule(booksGateway: BooksGateway): BooksUseCase =
        BooksUseCaseImpl(booksGateway)
}