package com.example.demo.dao;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    int id;

    @Column(name = "user_login")
    String login;

    @Column(name = "user_password")
    String password;

    @OneToMany(mappedBy = "user")
    Set<Review> reviews;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public User() {}
}
