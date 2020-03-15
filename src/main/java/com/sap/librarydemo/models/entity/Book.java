package com.sap.librarydemo.models.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    private String ISBN;
    private String bookName;
    private String author;
//    private int pageNum; //总页数
//    private String publisher; //出版社
    private int bookCount;

    @Override
    public String toString() {
        return "[图书编号=" + ISBN + ",图书名称=" + bookName + ", 作者=" + author + ",图书数量=" + bookCount + "]";

    }
}
