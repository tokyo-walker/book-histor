package com.crud.study.dto

import java.io.Serializable
import java.time.DateTimeException
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Author:Serializable {
    @GeneratedValue
    @Id
    var id :Int =0
    var name:String=""
    var birthday :Date=Date()
    var favorite:Boolean = true
}