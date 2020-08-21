package com.example.demo.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Book {

    private String ISBN;
    private String BookName;
    private String Category;
    @ManyToMany(mappedBy = "Books")
    private Set<Author> Author = new HashSet<>();
    private int Quantity;

    public Book(String ISBN, String bookName, String category, String publicationDate, int quantity) {
        this.ISBN = ISBN;
        BookName = bookName;
        Category = category;
        Quantity = quantity;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Set getAuthor() {
        return Author;
    }

    public void setAuthor(Set author) {
        Author = author;
    }


    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", BookName='" + BookName + '\'' +
                ", Category='" + Category + '\'' +
                ", Author=" + Author +
                ", Quantity=" + Quantity +
                '}';
    }
}

