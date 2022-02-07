package com.example.demo.dao;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "directors")
public class Director {
    @Id
    @Column(name = "director_id")
    int id;

    @Column(name = "name_and_surname")
    String nameAndSurname;

    @OneToMany(mappedBy = "director")
    Set<Movie> movies;

    public Director(int id, String name) {
        this.id = id;
        this.nameAndSurname = nameAndSurname;
    }

    public Director() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nameAndSurname;
    }

    public void setName(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }
}
