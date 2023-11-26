package com.mylee.learningspringboot.photoz.clone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotozController {
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}
