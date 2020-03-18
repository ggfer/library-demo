package com.sap.librarydemo.controllers;

import com.sap.librarydemo.models.entity.Book;
import com.sap.librarydemo.models.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

@Controller
public class LibraryController {
    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/index")
    String index() {
        System.out.println("进入主页");
        return "index";
    }

    @PostMapping("/saveAll")
    public @ResponseBody
    Boolean postFunction1(@RequestBody List<Book> books) throws URISyntaxException {
        try {
            libraryService.saveAll(books);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }


    @PostMapping("/save")
    public @ResponseBody
    Boolean postFunction2(@RequestBody Book book) throws URISyntaxException {
        try {
            libraryService.save(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }


    @PostMapping("/findAll")
    public @ResponseBody
    List<Book> postFunction3() throws URISyntaxException {
        List<Book> books = null;
        try {
            books = libraryService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(books.toString());
        return books;
    }


    @PostMapping("/findOne/{id}")
    public @ResponseBody
    Book postFunction4(@PathVariable(value = "id") Long id) throws URISyntaxException {
        Book book =null;
        try {
            book = libraryService.findOne(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(book.toString());
        return book;
    }




    @GetMapping("/findAll")
    public @ResponseBody
    List<Book> postFunction7() throws URISyntaxException {
        List<Book> books = null;
        try {
            books = libraryService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(books.toString());
        return books;
    }


    @GetMapping("/findOne/{id}")
    public @ResponseBody
    Book postFunction8(@PathVariable(value = "id") Long id) throws URISyntaxException {
        Book book =null;
        try {
            book = libraryService.findOne(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(book.toString());
        return book;
    }


}