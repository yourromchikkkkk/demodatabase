package com.example.demo.enums;

public enum Genre {
    SCI_FI("Science fiction"), ACT("Action"), CMD("Comedy"), DRM("Drama");

    String genre;
    private Genre(String genre) {
        this.genre = genre;
    }
}
