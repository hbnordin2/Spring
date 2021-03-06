package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class User {
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String passwordHash;
}
