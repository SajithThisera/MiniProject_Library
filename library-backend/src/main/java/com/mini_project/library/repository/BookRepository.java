package com.mini_project.library.repository;

import com.mini_project.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Integer> {
    Book findByTitle(String title);
}
