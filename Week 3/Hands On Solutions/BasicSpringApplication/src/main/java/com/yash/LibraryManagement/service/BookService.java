package com.yash.LibraryManagement.service;

import com.yash.LibraryManagement.repo.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printBook(int bookId) {
        String title = bookRepository.getBookTitleById(bookId);
        System.out.println("Book fetched: " + title);
    }
}
