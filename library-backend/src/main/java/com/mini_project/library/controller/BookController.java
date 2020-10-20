package com.mini_project.library.controller;

import com.mini_project.library.entity.Book;
import com.mini_project.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private LibraryService service;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        return service.saveBook(book);
    }

    @PostMapping("/addBooks")
    public List<Book> addBooks(@RequestBody List<Book> books){
        return service.saveBooks(books);
    }

    @GetMapping
    public List<Book> viewAllBooks(){
        return service.getBooks();
    }

    @GetMapping("/findBook/{id}")
    public Book findBookById(@PathVariable int id){
        return service.getBookById(id);
    }

    @GetMapping("/findBook/{title}")
    public Book findBookByTitle(@PathVariable String title){
        return service.getBookByTitle(title);
    }

    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book){
        return service.updateBook(book);
    }

    @DeleteMapping("deleteBook/{id}")
    public String deleteBook(@PathVariable int id){
        return service.deleteBook(id);
    }
}
