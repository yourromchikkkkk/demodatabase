package com.example.demo.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @Column(name = "movie_id")
    int id;

    @Column(name = "movie_name")
    String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "description_id")
    MovieDescription description;

    @ManyToOne()
    @JoinColumn(name="director_id", nullable=false)
    Director director;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_categories", joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    List<Category> categoryList;

    @Column(name = "average_rate_value")
    int averageRateValue;
}
