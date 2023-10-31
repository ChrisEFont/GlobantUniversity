/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author chris
 */

@Entity
public class Book {
    
    @Id
    private long isbn;
    private String title;
    private int copies;
    private int copiesBorroweds;
    private int copiesAvailable;
    
    @ManyToOne
    private Author author;
    
    @ManyToOne
    private Publisher publisher;

    public Book() {
    }
    
        public Book(Long isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public Book(Long isbn, String title, Integer copies, Integer copiesBorroweds, Integer copiesAvailable, Author author, Publisher publisher) {
        this.isbn = isbn;
        this.title = title;
        this.copies = copies;
        this.copiesBorroweds = copiesBorroweds;
        this.copiesAvailable = copiesAvailable;
        this.author = author;
        this.publisher = publisher;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public Integer getCopiesBorroweds() {
        return copiesBorroweds;
    }

    public void setCopiesBorroweds(Integer copiesBorroweds) {
        this.copiesBorroweds = copiesBorroweds;
    }

    public Integer getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(Integer copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", copies=" + copies + ", copiesBorroweds=" + copiesBorroweds + ", copiesAvailable=" + copiesAvailable + ", author=" + author + ", publisher=" + publisher + '}';
    }    
}
