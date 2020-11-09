package com.example.domain.gateways

import com.example.domain.entities.BookEntity
import com.example.domain.entities.ResponseEntity
import io.reactivex.Single

interface BooksGateway {

    fun getBooks(): Single<ResponseEntity<BookEntity>>
}