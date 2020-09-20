package com.guru.SpringbootWebApplication.repositories;


import com.guru.SpringbootWebApplication.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo  extends CrudRepository<Book, Long> {
}
