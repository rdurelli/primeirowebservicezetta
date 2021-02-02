package com.zetta.webservice.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @GetMapping(value = "/sayHello", produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello() {
        return "Hello";
    }

    @RequestMapping(value = "/sayHello2", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public String hello2(){
        return "Hello 2";
    }
}
