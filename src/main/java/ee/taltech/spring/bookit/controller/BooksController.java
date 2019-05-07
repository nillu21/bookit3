package ee.taltech.spring.bookit.controller;


import ee.taltech.spring.bookit.domain.Book;
import ee.taltech.spring.bookit.service.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping()
public class BooksController {

    @Resource
    BookServiceImpl bookService;

    @GetMapping(value = "/{id}")
    public String getBookById(Model model, @PathVariable Long id) {
        Book book = bookService.getBook(id);
        model.addAttribute("example_book", book);
        return "books";
    }
    @GetMapping()
    public String getAllBooks(Model model) {
        List<Book> allBooks = bookService.findAllBooks();
        model.addAttribute("books", allBooks);
        return "book-list";
    }
    @GetMapping("add")
    public String getAddPage(Model model) {
        model.addAttribute("book", new Book());
        return "add-book";
    }
    @PostMapping("books/add")
    public @ResponseBody String addBook(@ModelAttribute Book book) {
        Book result = bookService.addBook(book);

        return "<a href='http://localhost:8080/'>Book Added Successfully, click here to see all books</a>";
    }
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id, Model model) {
        bookService.deleteBook(id);
        List<Book> allBooks = bookService.findAllBooks();
        model.addAttribute("books", allBooks);
        return "book-list";
    }
    @GetMapping("/edit/{id}")
    public String editBook(@PathVariable Long id, Model model) {
        Book book = bookService.getBook(id);
        model.addAttribute("book", book);
        return "update-book";
    }
    @PostMapping("/update/{id}")
    public String updateBook(@PathVariable Long id, Model model, @ModelAttribute Book book) {

        bookService.updateBook(book);
        model.addAttribute("books", bookService.findAllBooks());
        return "book-list";
    }
}
