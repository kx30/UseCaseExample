package com.example.domain.usecases.books

import com.example.domain.entities.BookEntity
import com.example.domain.gateways.BooksGateway
import com.example.domain.models.BookModel
import io.reactivex.Single

class BooksUseCaseImpl(private val booksGateway: BooksGateway) : BooksUseCase {

    override fun invoke(): Single<List<BookModel>> {
        return booksGateway.getBooks()
            .flatMap { transformUser(it.items) }
    }

    private fun transformUser(entityList: List<BookEntity>): Single<List<BookModel>> {
        return Single.just(
            entityList.map { entity ->
                BookModel().apply {
                    this.id = entity.id
                    this.name = entity.name
                    this.author = entity.author
                    this.isAddedToBasket = false
                }
            }
        )
    }
}