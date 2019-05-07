package ee.taltech.spring.bookit.service;

import ee.taltech.spring.bookit.domain.Book;

import java.util.List;

public interface BookService {

    Book getBook(Long id);

    List<Book> findAllBooks();

    Book addBook(Book book);

    void saveAllBooks(List<Book> books);

    Book deleteBook(Long id);

    Book updateBook(Book book);

}
