package com.guru.SpringbootWebApplication.repositories;


import com.guru.SpringbootWebApplication.models.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepo extends CrudRepository<Author, Long> {



}
