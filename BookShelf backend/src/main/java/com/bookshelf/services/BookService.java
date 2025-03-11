package com.bookshelf.services;

import java.util.List;
import java.util.Optional;

import com.bookshelf.entities.Book;

public interface BookService {
    List<Book> getAllBooks();
    Optional<Book> getBookById(Long id);
    List<Book> searchBooksByTitle(String title);
    Book saveBook(Book book);
    Optional<Book> updateBook(Long id, Book book);
    boolean deleteBook(Long id);
}
