package com.example.demo.controller;

import com.example.demo.model.HealthStatus;
import com.example.demo.model.Widget;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/bodyComposition/**")
@RestController
public class BodyComposition {

    @RequestMapping(path="/{userId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public HealthStatus index(@PathVariable final int userId) {
        HealthStatus hs = new HealthStatus(userId, 0.9, 50, 100);
        return hs;
    }
}