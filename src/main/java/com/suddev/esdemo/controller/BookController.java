package com.suddev.esdemo.controller;


import com.google.common.collect.Lists;
import com.suddev.esdemo.entity.Book;
import com.suddev.esdemo.repository.BookRepo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * Controller
 *
 * @author suddev
 * @create 2018-03-31 下午1:10
 **/
@RestController
@EnableSwagger2
public class BookController {

    @Resource
    private BookRepo bookRepo;

    @GetMapping("/book/get/{id}")
    public Book getBook(@PathVariable String id) {
        return bookRepo.findById(id).get();
    }

    @PostMapping("/book/put")
    public Book putBook(@RequestBody Book book) {
        if (book != null) {
            return bookRepo.save(book);
        }
        return new Book();
    }

    @GetMapping("/book/all")
    public List<Book> getAll() {
        return Lists.newArrayList(bookRepo.findAll());
    }
}
