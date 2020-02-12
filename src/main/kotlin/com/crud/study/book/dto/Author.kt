package com.crud.study.book.dto

import java.io.Serializable
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "author")
class Author(
    @GeneratedValue
    @Id
    var id :Int =0,
    var name:String="",
    var birthday :Date=Date(),
    var favorite:Boolean = true
):Serializable