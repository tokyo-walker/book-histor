package com.crud.study.controller

import com.crud.study.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/index")
class MainController {

    @Autowired
    lateinit var bookRepository: BookRepository

    @GetMapping("/findAll")
    fun findAll():String{
        return bookRepository.findById(1).get().title
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