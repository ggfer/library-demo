package com.sap.librarydemo.models.service;

import com.sap.librarydemo.models.entity.Admin;
import com.sap.librarydemo.models.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LibraryService {

    public void save(Book book);

    public void saveAll(List<Book> books);

    public List<Book> findAll();

    public Book findOne(Long id);

    public void delete(Long id);

//    /**
//     * 登录
//     *
//     * @param adminid
//     * @param adminpwd
//     * @return
//     */
//    public boolean Admin(String adminid, String adminpwd);
//
//
//    /**
//     * 注册
//     *
//     * @param adminid
//     * @param adminpwd
//     */
//    public void regist(String adminid, String adminpwd);
//
//
//    /**
//     * 通过id获取用户信息
//     *
//     * @param adminId
//     * @return
//     */
//    public Admin getAdminbyId(String adminId);
//
//
//    /**
//     * 获得所有图书
//     *
//     * @return
//     */
//    public List<Book> getAllBooks();
//
//    /**
//     * 通过作者、ISBN、书名、书的数量信息查找书
//     *
//     * @param filed
//     * @param keyword or bookCount
//     * @return
//     */
//    public Book findOne(String filed, String keyword);
//    public Book findOne(String filed, int bookcount);
//
//
//    /**
//     * 新增图书
//     *
//     * @param ISBN
//     * @param bookName
//     * @param author
//     * @param bookcount
//     * @return
//     */
//    public boolean addBook(String ISBN, String bookName, String author, int bookcount);
//
//
//    /**
//     * 删除图书
//     *
//     * @param ISBN
//     * @return
//     */
//    public boolean deleteBook(String ISBN);
}
