package com.crud.study.book.dto

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "book")
class Book(
    @GeneratedValue
    @Id
    var id: Int = 0,
    @Column(name = "author")
    var authorName: String = "",
    var title: String = "",
    var publishDay: String = "",
    var read: Boolean = true
):Serializable