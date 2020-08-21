package com.example.demo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Author {

    private String AuthorId;
    private String AuthorName;
    private String AuthorDescrip;
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "ISBN"), inverseJoinColumns = @JoinColumn(name = "AuthorId"))
    private Set<Book> Books = new HashSet<>();

    public Author(String authorId, String authorName, String authorDescrip, Set<Book> books) {
        AuthorId = authorId;
        AuthorName = authorName;
        AuthorDescrip = authorDescrip;
        Books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return AuthorId.equals( author.AuthorId ) &&
                AuthorName.equals( author.AuthorName ) &&
                AuthorDescrip.equals( author.AuthorDescrip ) &&
                Books.equals( author.Books );
    }

    @Override
    public int hashCode() {
        return Objects.hash( AuthorId, AuthorName, AuthorDescrip, Books );
    }

    @Override
    public String toString() {
        return "Author{" +
                "AuthorId='" + AuthorId + '\'' +
                ", AuthorName='" + AuthorName + '\'' +
                ", AuthorDescrip='" + AuthorDescrip + '\'' +
                ", Books=" + Books +
                '}';
    }
}