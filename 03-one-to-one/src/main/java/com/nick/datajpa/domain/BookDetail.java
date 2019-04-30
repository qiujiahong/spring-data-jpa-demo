package com.nick.datajpa.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDetail {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Integer numberOfPages;
    private Integer price;

    @OneToOne(mappedBy = "bookDetail")
    private Book book;

    public BookDetail(Integer numberOfPages, Integer price) {
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public BookDetail(Integer numberOfPages, Integer price, Book book) {
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookDetail{" +
                "id=" + id +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
//                ", book=" + book +
                '}';
    }
}