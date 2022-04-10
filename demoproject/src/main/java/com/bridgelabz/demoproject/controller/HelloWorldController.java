package com.bridgelabz.demoproject.controller;


import com.bridgelabz.demoproject.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    //UC1
    @RequestMapping (value = {"" , "/" , "/get" , "/home"},method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello From BridgeLabz";
    }
}
