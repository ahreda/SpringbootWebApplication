package com.guru.SpringbootWebApplication;

import com.guru.SpringbootWebApplication.models.Author;
import com.guru.SpringbootWebApplication.models.Book;
import com.guru.SpringbootWebApplication.models.Publisher;
import com.guru.SpringbootWebApplication.repositories.AuthorRepo;
import com.guru.SpringbootWebApplication.repositories.BookRepo;
import com.guru.SpringbootWebApplication.repositories.PublisherReop;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootstrap implements CommandLineRunner {

   private AuthorRepo authorRepo;
   private BookRepo bookRepo;
   private PublisherReop publisherRepo;

    public bootstrap(AuthorRepo authorRepo, BookRepo bookRepo, PublisherReop publisherRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Author author1 = new Author("Ahmad", "Reda");
        Author author2 = new Author("Sami","Robert");

        Book book1 = new Book("Deep Learning","afd12");
        Book book2 = new Book("Neural Networks","aju52");
        book1.getAuthors().add(author1);
        book2.getAuthors().add(author2);

        author1.getBooks().add(book1);
        author2.getBooks().add(book2);


        bookRepo.save(book1);
        bookRepo.save(book2);
        authorRepo.save(author1);
        authorRepo.save(author2);

        System.out.println("Data loader is started");
        System.out.println("number of books is: " + bookRepo.count());
        System.out.println("number of authors is: " + authorRepo.count());

        Publisher publisher1 = new Publisher("Spring","addressLine1","addressLine1","state",2315);
        Publisher publisher2 = new Publisher("ACTA","addressLine1","addressLine1","state",45545);

        publisher1.getBookList().add(book1);
        publisher2.getBookList().add(book2);

        book1.setPublisher(publisher1);
        book2.setPublisher(publisher2);

        publisherRepo.save(publisher1);
        publisherRepo.save(publisher2);
        bookRepo.save(book1);
        bookRepo.save(book2);



        System.out.println("Number of books published by Spring : " + publisher1.getBookList().size());



    }
}
