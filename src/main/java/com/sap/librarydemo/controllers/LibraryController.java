package com.sap.librarydemo.controllers;

import com.sap.librarydemo.models.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @RequestMapping("/lib")
    String qwer() {
        return "library";
    }

}