package com.crud.study.book.repository

import com.crud.study.book.dto.Author
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository : JpaRepository<Author, Int> {

}