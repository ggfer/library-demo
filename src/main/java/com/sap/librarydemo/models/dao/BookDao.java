package com.sap.librarydemo.models.dao;

import com.sap.librarydemo.models.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface BookDao extends PagingAndSortingRepository<Book, Long> {
//    public List<Book> getAllList();
//
//    public boolean addBook(Book book);
//
//    public boolean deleteBook(Book book);
//
//    public boolean updateBook(Book book);
}

