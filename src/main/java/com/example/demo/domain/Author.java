package com.example.demo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int AuthorId;
    private String AuthorFirstName;
    private String AuthorLastName;
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "ISBN"), inverseJoinColumns = @JoinColumn(name = "AuthorId"))
    private Set<Book> Books = new HashSet<>();

    public Author(int authorId, String authorFirstName, String authorLastName) {
        AuthorId = authorId;
        AuthorFirstName = authorFirstName;
        AuthorLastName = authorLastName;

    }

    public int getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(int authorId) {
        AuthorId = authorId;
    }

    public String getAuthorFirstName() {
        return AuthorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        AuthorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return AuthorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        AuthorLastName = authorLastName;
    }

    public Set<Book> getBooks() {
        return Books;
    }

    public void setBooks(Set<Book> books) {
        Books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return AuthorId == author.AuthorId &&
                Objects.equals( AuthorFirstName, author.AuthorFirstName ) &&
                Objects.equals( AuthorLastName, author.AuthorLastName ) &&
                Objects.equals( Books, author.Books );
    }

    @Override
    public int hashCode() {
        return Objects.hash( AuthorId );
    }

    @Override
    public String toString() {
        return "Author{" +
                "AuthorId=" + AuthorId +
                ", AuthorFirstName='" + AuthorFirstName + '\'' +
                ", AuthorLastName='" + AuthorLastName + '\'' +
                ", Books=" + Books +
                '}';
    }
}