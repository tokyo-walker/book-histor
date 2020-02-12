package com.crud.study.service

import com.crud.study.book.dto.Book
import com.crud.study.book.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService (private val bookRepository: BookRepository){

    fun findAll():List<Book>{
        return bookRepository.findAll()
    }
}