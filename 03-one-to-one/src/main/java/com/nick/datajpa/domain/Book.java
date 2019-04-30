package com.nick.datajpa.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String isbn;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_detail_id")
//    @Lazy(false)
    private BookDetail bookDetail;

    public Book(String name, String isbn, BookDetail bookDetail) {
        this.name = name;
        this.isbn = isbn;
        this.bookDetail = bookDetail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isbn='" + isbn + '\'' +
                ", bookDetail=" + bookDetail +
                '}';
    }
}