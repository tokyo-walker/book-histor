package com.crud.study.service

import com.crud.study.book.dto.Author
import com.crud.study.book.repository.AuthorRepository
import org.springframework.stereotype.Service

@Service
class AuthorService (private val authorRepo:AuthorRepository){

    fun findAll():List<Author>{
        return authorRepo.findAll()
    }

}