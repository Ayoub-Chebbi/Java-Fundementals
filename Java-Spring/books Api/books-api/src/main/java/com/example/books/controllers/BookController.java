package com.example.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.books.models.Book;
import com.example.books.services.BookService;

import org.springframework.ui.Model;

@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/")
	public String home() {
		return "redirect:/books";
	}
	
	@GetMapping("/books/{bookId}")
	public String index(Model model, @PathVariable("bookId") Long bookId) {
		
        model.addAttribute("book", bookService.findBook(bookId));
        return "show.jsp";
	}        
    @GetMapping("/books")
    public String index(Model model) {
    	List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "index.jsp";
    	}

}

