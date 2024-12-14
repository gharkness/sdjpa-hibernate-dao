package guru.springframework.jdbc.dao;

import guru.springframework.jdbc.domain.Book;

import java.util.List;

public interface BookDao {
    Book findBookByTitleNative(String title);

    Book findBookByTitleCriteria(String title);

    List<Book> findAll();

    Book findByISBN(String isbn);

    Book getById(Long id);

    Book findBookByTitle(String title);

    Book saveNewBook(Book book);

    Book updateBook(Book book);

    void deleteBookById(Long id);
}
