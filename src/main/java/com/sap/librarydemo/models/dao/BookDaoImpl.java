package com.sap.librarydemo.models.dao;

import com.sap.librarydemo.models.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {
    List<Book> booklist = new ArrayList<Book>();

//    public BookDaoImpl(){
//        booklist  = new ArrayList<Book>();
//    }

    public void init() {
        Book book1 = new Book().builder()
                .ISBN("0001")
                .bookName("JavaScript高级程序设计")
                .author("Nicholas")
                .build();
        Book book2 = new Book().builder()
                .ISBN("0002")
                .bookName("Head First jQuery")
                .author("Ryan")
                .build();
        Book book3 = new Book().builder()
                .ISBN("0003")
                .bookName("JavaScript DOM编程艺术")
                .author("Jeremy")
                .build();
        booklist.add(book1);
        booklist.add(book2);
        booklist.add(book3);

    }

    @Override
    public List<Book> getAllList() {
        return booklist;
    }

    @Override
    public boolean addBook(Book book) {
        return booklist.add(book);
    }

    @Override
    public boolean updateBook(Book book) {
        return false;
    }

    @Override
    public boolean deleteBook(Book book) {
        return false;
    }
}
