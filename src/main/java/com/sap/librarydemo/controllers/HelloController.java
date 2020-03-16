package com.sap.librarydemo.controllers;


import com.sap.librarydemo.models.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String helloThymeleaf(Model model) {
//        List<Book> booklist = new ArrayList<Book>();
//        Book book1 = new Book().builder()
//                .ISBN("0001")
//                .bookName("JavaScript高级程序设计")
//                .author("Nicholas")
//                .build();
//        Book book2 = new Book().builder()
//                .ISBN("0002")
//                .bookName("Head First jQuery")
//                .author("Ryan")
//                .build();
//        Book book3 = new Book().builder()
//                .ISBN("0003")
//                .bookName("JavaScript DOM编程艺术")
//                .author("Jeremy")
//                .build();
//        booklist.add(book1);
//        booklist.add(book2);
//        booklist.add(book3);

        model.addAttribute("name", "糊糊鸭");
        System.out.println("sdf");
        return "hello";
    }

//    @ResponseBody
//// @RequestParam("yourData")是必不可少的，因为他指定了链接中的参数名称
//    public String yourUrl(@RequestParam("yourData") String yourData) {
//        System.out.println(yourData);
//        // 返回值可以自由定义
//        return "hello";
//    }

}