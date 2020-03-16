package com.sap.librarydemo.models.service;

import com.sap.librarydemo.models.dao.BookDao;
import com.sap.librarydemo.models.entity.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    private final BookDao bookDao;
    public LibraryServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Transactional(readOnly=true)
    @Override
    public List<Book> findAll() {
        return (List<Book>)bookDao.findAll();
    }


    @Transactional
    @Override
    public void save(Book Book) {
        bookDao.save(Book);
    }

    @Transactional(readOnly=true)
    @Override
    public Book findOne(Long id) {
        return bookDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        bookDao.deleteById(id);
    }



//
//    /**
//     * 登录
//     *
//     * @param adminid
//     * @param adminpwd
//     * @return
//     */
//    @Override
//    public boolean Admin(String adminid, String adminpwd) {
//        for (Admin admin : admList) {
//            if (adminid.equals(admin.getAdminId()) && adminpwd.equals(admin.getAdminPwd())) {
//                System.out.println("信息正确，已经进入系统!");
//                return true;
//            } else {
//                System.err.println("用户名或者密码错误！");
//            }
//        }
//        return false;
//    }
//
//    /**
//     * 注册
//     *
//     * @param adminid
//     * @param adminpwd
//     */
//    @Override
//    public void regist(String adminid, String adminpwd) {
//        Admin admin = new Admin(admList.size() + 1, adminid, adminpwd);
//        adi.insert(admin);
//    }
//
//    /**
//     * 通过id获取用户信息
//     *
//     * @param adminId
//     * @return
//     */
//    @Override
//    public Admin getAdminbyId(String adminId) {
//        for (Admin admin : admList) {
//            if (admin.getAdminId() == adminId) {
//                return admin;
//            }
//        }
//        return null;
//    }
//
//    /**
//     * 获得所有图书
//     *
//     * @return
//     */
//    @Override
//    public List<Book> getAllBooks() {
//        System.out.println("本图书馆共有" + booklist.size() + "种书");
//        for (Book book : booklist) {
//            System.out.println(book.toString());
//        }
//        return booklist;
//    }
//
//    /**
//     * 通过作者、ISBN、书名、书的数量信息查找书
//     *
//     * @param filed
//     * @param keyword or bookCount
//     * @return
//     */
//
//
//    @Override
//    public Book findOne(String filed, String keyword) {
//        for (Book curbook : booklist) {
//            switch (filed) {
//                case "author":
//                    if (curbook.getAuthor().equals(keyword)) {
//                        System.out.println(curbook.toString());
//                        return curbook;
//                    }
//                case "ISBN":
//                    if (curbook.getISBN().equals("")) {
//                        System.out.println(curbook.toString());
//                        return curbook;
//                    }
//                case "bookName":
//                    if (curbook.getBookName().equals(keyword)) {
//                        System.out.println(curbook.toString());
//                        return curbook;
//                    }
//            }
//        }
//        return null;
//    }
//
//    public Book findOne(String filed, int bookcount) {
//        for (Book curbook : booklist) {
//            switch (filed) {
//                case "bookCount":
//                    if (curbook.getBookCount() == bookcount) {
//                        System.out.println(curbook.toString());
//                        return curbook;
//                    }
//                    //..extension filed
//            }
//        }
//        return null;
//    }
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
//    @Override
//    public boolean addBook(String ISBN, String bookName, String author, int bookcount) {
//        Book book = new Book().builder()
//                .ISBN(ISBN)
//                .bookName(bookName)
//                .author(author)
//                .bookCount(bookcount)
//                .build();
//
//        for (Book curbook : booklist) {
//            if (curbook.getISBN().equals(ISBN) && curbook.getBookName().equals(bookName)) {
//                curbook.setBookCount(curbook.getBookCount() + bookcount);
//                System.out.println("书本数量更新!");
//            } else if ((curbook.getISBN().equals(ISBN) | curbook.getBookName().equals(bookName))) {
//                System.err.println("与图书馆已存在的该书信息插入冲突！");
//                return false;
//            }
//        }
//        bdi.addBook(book);
//        System.out.println("新增成功!");
//        return true;
//    }
//
//
//    /**
//     * 删除图书
//     *
//     * @param ISBN
//     * @return
//     */
//    @Override
//    public boolean deleteBook(String ISBN) {
//        for (int i = 0; i < booklist.size(); i++) {
//            Book booktemp = booklist.get(i);
//            if (booktemp.getISBN().equals(ISBN)) {
//                booklist.remove(i);
//                System.out.println("删除成功");
//                return true;
//            }
//        }
//        System.err.println("没有找到ISBN对应的书");
//        return false;
//    }
}
