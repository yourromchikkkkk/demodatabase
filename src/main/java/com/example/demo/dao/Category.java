package com.example.demo.dao;

import com.example.demo.enums.Genre;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @Column(name = "category_id")
    int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "genre")
    Genre genre;
}
