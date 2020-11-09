package com.example.gateway

import com.example.domain.entities.BookEntity
import com.example.domain.entities.ResponseEntity
import com.example.domain.gateways.BooksGateway
import io.reactivex.Single

class RetrofitBooksGateway(private val api: Api) : BooksGateway {

    override fun getBooks(): Single<ResponseEntity<BookEntity>> =
        api.getBooks()
}