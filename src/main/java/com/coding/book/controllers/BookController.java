package com.coding.book.controllers;


import com.coding.book.models.Book;
import com.coding.book.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping
    public String showAll(Model model){
        List<Book> books = bookService.allBooks();
        model.addAttribute("books",books);
        return"all.jsp";
    }
    @RequestMapping("/{id}")
    public String showOne(@PathVariable("id") Long id, Model model){
        Book myBook = bookService.findBook(id);
        model.addAttribute("title", myBook.getTitle());
        model.addAttribute("desc", myBook.getDescription());
        model.addAttribute("lang", myBook.getLanguage());
        model.addAttribute("pages", myBook.getNumberOfPages());
        return "show.jsp";
    }
}
