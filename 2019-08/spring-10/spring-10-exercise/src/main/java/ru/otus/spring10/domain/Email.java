package ru.otus.spring10.domain;

public class Email {

    private int id;

    private String email;

    public Email(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
