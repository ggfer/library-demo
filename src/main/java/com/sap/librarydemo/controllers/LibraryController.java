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

import java.net.URISyntaxException;
import java.util.List;

@Controller
public class LibraryController {
    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/*")
    String index() {
        System.out.println("进入主页");
        return "index";
    }

    @PostMapping(path = "/index")
    public Boolean postFunction1(@RequestBody Book book) throws URISyntaxException {
        try {
            libraryService.save(book);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

//        model.addAttribute("", "Listado de clientes");
//        model.addAttribute("clientes", clientes);
//        model.addAttribute("page", pageRender);

        return true;
    }

}