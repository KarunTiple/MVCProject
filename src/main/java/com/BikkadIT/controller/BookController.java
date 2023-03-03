package com.BikkadIT.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.model.Book;

@RestController
public class BookController {

	@GetMapping("/books")
	public ModelAndView getBookData() {

		Book book = new Book();
		book.setBookId(101);
		book.setBookName("Java");
		book.setBookPrice(725.00);

		ModelAndView mav = new ModelAndView();
		mav.addObject("BOOKS", book);
		mav.setViewName("book");
		return mav;
	}

	@GetMapping("/getAllBooks")
	public ModelAndView getAllBooks() {

		Book book = new Book();
		book.setBookId(1234);
		book.setBookName("Java");
		book.setBookPrice(725.00);

		Book book1 = new Book();
		book1.setBookId(1234);
		book1.setBookName("Python");
		book1.setBookPrice(650.00);

		Book book2 = new Book();
		book2.setBookId(1234);
		book2.setBookName("C++");
		book2.setBookPrice(500.00);

		Book book3 = new Book();
		book3.setBookId(1234);
		book3.setBookName("Spring");
		book3.setBookPrice(900.00);

		List<Book> books = new ArrayList<Book>();
		books.add(book);
		books.add(book1);
		books.add(book2);
		books.add(book3);

		ModelAndView mav = new ModelAndView();
		mav.addObject("BOOKS", books);
		mav.setViewName("book");

		return mav;

	}
}
