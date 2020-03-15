package com.sap.librarydemo.models.dao;

import com.sap.librarydemo.models.entity.Book;

import java.util.List;

public interface BookDao {
    public List<Book> getAllList();

    public boolean addBook(Book book);

    public boolean deleteBook(Book book);

    public boolean updateBook(Book book);
}
