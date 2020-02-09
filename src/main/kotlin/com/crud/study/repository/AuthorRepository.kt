package com.crud.study.repository

import com.crud.study.dto.Author
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.validation.ReportAsSingleViolation

@Repository
interface AuthorRepository : JpaRepository<Author, Int> {

}