package com.yash.BasicSpringApplication.service;


import com.yash.BasicSpringApplication.repo.BookRepository;

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
