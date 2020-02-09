package com.crud.study.repository

import com.crud.study.dto.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository:JpaRepository<Book,Int>{

    fun findByAuthor(name:String):List<Book>
}