package ee.taltech.spring.bookit.service;

import ee.taltech.spring.bookit.domain.Book;
import ee.taltech.spring.bookit.repository.BookRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookRepository bookRepository;

    @Override
    public Book getBook(Long id) {
        return bookRepository.getOne(id);
    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void saveAllBooks(List<Book> books) {
        bookRepository.saveAll(books);
    }

    @Override
    public Book deleteBook(Long id) {
        Book book = bookRepository.getOne(id);
        bookRepository.delete(book);
        return book;
    }

    @Override
    public Book updateBook(Book book) {
        bookRepository.save(book);
        return null;
    }


}
