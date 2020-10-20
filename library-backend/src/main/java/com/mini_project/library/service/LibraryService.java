package com.mini_project.library.service;

import com.mini_project.library.entity.Book;
import com.mini_project.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    @Autowired
    private BookRepository repository;

    public Book saveBook(Book book){
        return repository.save(book);
    }

    public List<Book> saveBooks(List<Book> books){
        return repository.saveAll(books);
    }

    public List<Book> getBooks(){
        return repository.findAll();
    }

    public Book getBookById(int id){
        return repository.findById(id).orElse(null);
    }

    public Book getBookByTitle(String title){
        return repository.findByTitle(title);
    }

    public String deleteBook(int id){
        repository.deleteById(id);
        return "Book removed! " + id;
    }

    public Book updateBook(Book book){
        Book existingBook = repository.findById(book.getId()).orElse(null);
        existingBook.setISBN(book.getISBN());
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setBorrower(book.getBorrower());
        existingBook.setIssuedon(book.getIssuedon());
        existingBook.setDuedate(book.getDuedate());

        return repository.save(existingBook);
    }
}
