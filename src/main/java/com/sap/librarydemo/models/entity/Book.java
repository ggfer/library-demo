package com.sap.librarydemo.models.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@Entity
@Table(name = "book")
public class Book implements Serializable {

    private static final long serialVersionUID = 4071123734063333268L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uuid;

    @Column(name = "ISBN")
    private String ISBN;

    @Column(name = "BOOK_NAME")
    private String bookName;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "BOOK_COUNT")
    private int bookCount;

//    private int pageNum; //总页数
//    private String publisher; //出版社

    @Override
    public String toString() {
        return "[图书编号=" + ISBN + ",图书名称=" + bookName + ", 作者=" + author + ",图书数量=" + bookCount + "]";

    }
}
