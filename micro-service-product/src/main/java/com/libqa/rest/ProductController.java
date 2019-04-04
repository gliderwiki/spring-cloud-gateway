package com.libqa.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Value("${server.port}")
    String port;


    @GetMapping("/product/item/name")
    public String productName() {
        return "Nike Air-max " + port;
    }
}
