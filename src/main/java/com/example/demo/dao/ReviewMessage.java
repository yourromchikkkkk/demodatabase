package com.example.demo.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ReviewMessage {
    @Id
    @Column(name = "review_message_id")
    int id;

    @Column(name = "review_message")
    String message;

    @OneToOne(mappedBy = "reviewMessage")
    Review review;
}
