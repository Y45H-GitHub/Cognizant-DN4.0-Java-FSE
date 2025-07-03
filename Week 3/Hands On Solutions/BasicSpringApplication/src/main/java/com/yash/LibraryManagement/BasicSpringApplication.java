package com.yash.LibraryManagement;


import com.yash.LibraryManagement.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicSpringApplication {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			BookService bookService = context.getBean(BookService.class);
			bookService.printBook(101);
		} catch (Exception e) {
			System.err.println("Spring context failed to load: " + e.getMessage());
			e.printStackTrace();
		}
	}
}