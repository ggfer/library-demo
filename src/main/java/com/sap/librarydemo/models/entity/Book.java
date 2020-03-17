package com.sap.librarydemo.models.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book implements Serializable {

    private static final long serialVersionUID = 4071123734063333268L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "isbn")
    private String ISBN;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "author")
    private String author;

    @Column(name = "book_count")
    private int bookCount;

//    private int pageNum; //总页数
//    private String publisher; //出版社

    @Override
    public String toString() {
        return "[图书编号=" + ISBN + ",图书名称=" + bookName + ", 作者=" + author + ",图书数量=" + bookCount + "]";

    }
}
