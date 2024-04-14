package com.example.demoaop;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TestController {
    @GetMapping("/test/{word}")
    public String test(@PathVariable String word) throws IOException {

        if (word.equals("yes")) {
            throw new RuntimeException();
        }

        return word;
    }

}
