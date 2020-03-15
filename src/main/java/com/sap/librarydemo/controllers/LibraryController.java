package com.sap.librarydemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibraryController {

    @RequestMapping("/lib")
    String qwer() {
        return "library";
    }

}