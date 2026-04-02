package Ports;

import Domain.Book;

public interface BookRepository {
    Book getBookById(String id);
    void updateBook(Book book);
}
