package com.guru.SpringbootWebApplication.repositories;


import com.guru.SpringbootWebApplication.models.Author;
import com.guru.SpringbootWebApplication.models.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepo  extends CrudRepository<Book, Long> {

}
