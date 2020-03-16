package com.sap.librarydemo.models.dao;

import com.sap.librarydemo.models.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookDao extends CrudRepository<Book, Long> {

}

