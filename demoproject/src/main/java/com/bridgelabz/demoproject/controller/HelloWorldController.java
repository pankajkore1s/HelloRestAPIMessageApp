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

    //UC2
    @RequestMapping(value={"/query"}, method=RequestMethod.GET)
    public String helloWorldFirstName(@RequestParam(value="firstname")String firstname){
        return "Hello "+firstname+" "+"From Bridgelabz";
    }

    //UC3
    @GetMapping("/firstname") /////////either GetMapping or RequestMapping is Used///
    ///@RequestMapping(value={"/query"} , method= RequestMethod.GET)
    public  String helloWorldName(@RequestParam(value = "firstname") String firstname){
        return "Hello "+firstname+" "+"From BridgeLabz";
    }
}
