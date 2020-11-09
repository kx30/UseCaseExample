package com.example.domain.usecases.books

import com.example.domain.models.BookModel
import io.reactivex.Single

interface BooksUseCase {

    operator fun invoke(): Single<List<BookModel>>
}