package com.example.demo.model;

import lombok.Getter;

/**
 * Created by XTL on 8/14/2014.
 */
public class Widget {
    @Getter
    private String type;

    @Getter
    private int length;

    @Getter
    private int height;

    public Widget(String type, int length, int height) {
        this.type = type;
        this.length = length;
        this.height = height;
    }
}