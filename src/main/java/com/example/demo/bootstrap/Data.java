package com.example.demo.bootstrap;

import com.example.demo.domain.Author;
import com.example.demo.domain.Book;
import com.example.demo.repositories.AuthorRepository;
import com.example.demo.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Data implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public Data(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
/*
        Author jacob = new Author( 001, "Jacob","Wikings" );
        Book twilight = new Book( "2626575","Twilight","Novel",20 );
        jacob.getBooks().add( twilight );
        twilight.getAuthor().add( jacob );

        authorRepository.save( jacob );
        bookRepository.save( twilight );

        Author apeksha = new Author( 002,"Apeksha","Rathnamali" );
        Book women = new Book( "43542342","Women","Short Story",4 );
        apeksha.getBooks().add( women );
        women.getAuthor().add( apeksha );

        authorRepository.save( apeksha );
        bookRepository.save( women );

        System.out.println("Started in bootstrap...");
        System.out.println("Number of books: "+ bookRepository.count());

 */

    }
}
