package com.guru.SpringbootWebApplication.repositories;


import com.guru.SpringbootWebApplication.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {

}
