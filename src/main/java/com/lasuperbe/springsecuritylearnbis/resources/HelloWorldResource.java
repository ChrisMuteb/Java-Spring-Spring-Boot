package com.lasuperbe.springsecuritylearnbis.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
    @GetMapping("/hello-world")
    public String helloworld(){
        return "Hello world v1";
    }
}
