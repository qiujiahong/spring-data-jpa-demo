package com.nick.datajpa.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(length = 20)
    private String name;

    private Integer hour;

}
