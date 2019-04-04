package com.libqa.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${server.port}")
    String port;


    @GetMapping("/status/check")
    public String status() {
        return "Working on port : " + port;
    }
}

