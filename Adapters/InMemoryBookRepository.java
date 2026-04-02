package Adapters;

import java.util.HashMap;
import java.util.Map;
import Domain.Book;
import Ports.BookRepository;

public class InMemoryBookRepository implements BookRepository {

    private Map<String, Book> books = new HashMap<>();

    public Book getBookById(String id) {
        return books.get(id);
    }

    public void updateBook(Book book) {
        books.put(book.getId(), book);
    }

    public void add(Book book) {
        books.put(book.getId(), book);
    }
}
