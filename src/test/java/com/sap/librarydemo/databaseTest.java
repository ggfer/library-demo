package com.sap.librarydemo;


import com.sap.librarydemo.models.entity.Book;
import com.sap.librarydemo.models.service.LibraryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class databaseTest {



    @Autowired
    DataSource dataSource;

//    @Autowired
//    LibraryService libraryService;


    @Test
    public void test() {
        System.out.println(dataSource.getClass());
    }
//
//    @Test
//    public void testfindAll(){
//        List<Book> a= libraryService.findAll();
//        System.out.println(a);
//    }

}
