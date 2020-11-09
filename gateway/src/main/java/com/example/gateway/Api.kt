package com.example.gateway

import com.example.domain.entities.BookEntity
import com.example.domain.entities.ResponseEntity
import io.reactivex.Single
import retrofit2.http.GET

interface Api {

    @GET("/api/books")
    fun getBooks(): Single<ResponseEntity<BookEntity>>
}