package com.coding.book.services;

// ...
import com.coding.book.repositories.BookRepository;
import org.springframework.stereotype.Service;
import com.coding.book.models.Book;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
        Book myBook = this.findBook(id);
        if (myBook == null){
            return null;
        }
        myBook.setTitle(title);
        myBook.setDescription(desc);
        myBook.setLanguage(lang);
        myBook.setNumberOfPages(numOfPages);
        return bookRepository.save(myBook);
    }

    public String deleteBook(Long id) {
        Book myBook = this.findBook(id);
        if (myBook == null){
            return "No book exists";
        }
        bookRepository.deleteById(id);
        return "Book Successfully Deleted";
    }
}

