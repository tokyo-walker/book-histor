package com.crud.study.controller

import com.crud.study.service.AuthorService
import com.crud.study.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/index")
class MainController {

    @Autowired
    lateinit var bookService: BookService
    @Autowired
    lateinit var authorService: AuthorService


    @GetMapping("/findAll")
    fun findAll():String{
        return "findALL todo"
    }
//    @RequestMapping(value = "/get/{name}", method = RequestMethod.GET)
//    fun get(@PathVariable("name") name:String):String{
//        return bookRepository.findByAuthor(name).toString()
//    }

    @PostMapping("/delete")
    fun delete(){}

    @RequestMapping("/read")
    fun readAll(){}

}