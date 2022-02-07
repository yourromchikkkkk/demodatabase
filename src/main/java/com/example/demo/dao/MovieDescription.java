package com.example.demo.dao;

import javax.persistence.*;

@Entity
@Table(name = "movie_descriptions")
public class MovieDescription {
    @Id
    @Column(name = "description_id")
    int id;

    @Column(name = "movie_description")
    String description;

    @OneToOne(mappedBy = "description")
    Movie movie;
}
