package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class HealthStatus {
    @Getter
    @Setter
    public User user;

    @Getter
    @Setter
    public double bodyFat;

    @Getter
    @Setter
    public double height;

    @Getter
    @Setter
    public double weight;

    public HealthStatus(int userId, double bodyFat, double height, double weight) {
        this.user = new User(1, "username", "passwordHash");
        this.bodyFat = bodyFat;
        this.height = height;
        this.weight = weight;
    }
}
