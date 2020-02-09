package com.crud.study.dto

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Book :Serializable{
    @GeneratedValue
    @Id
    var id :Int=0
    var author:String=""
    var title:String=""
    var publishDay:String=""
    var read:Boolean=true
}