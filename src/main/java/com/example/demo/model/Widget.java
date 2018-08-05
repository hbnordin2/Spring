package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by XTL on 8/14/2014.
 */
@AllArgsConstructor
public class Widget {
    @Getter
    private String type;

    @Getter
    private int length;

    @Getter
    private int height;
}