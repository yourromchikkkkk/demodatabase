package com.example.demo.dao;

import com.example.demo.enums.Rate;
import javax.persistence.Table;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @Column(name = "review_id")
    int id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    Movie movie;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "review_message_id")
    ReviewMessage reviewMessage;

    @Enumerated(EnumType.STRING)
    @Column(name = "rate_value")
    Rate rate;

    @Column(name = "is_liked")
    boolean isLiked;
}
