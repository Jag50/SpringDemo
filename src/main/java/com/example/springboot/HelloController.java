package com.example.springboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    String temp = "Greetings from Spring Boot!\n";

    @GetMapping("/Hello") //get mapping
    public String index() {


        return temp;
    }

//    @GetMapping ("/HelloWorld") //springboot put mapping example
//    public String sayHello() {
//        return "Hello World!\n";
//    }

    @PutMapping ("/Hello/Update") // to update
    public String updateSayHello(@RequestBody String Hello){

        temp = Hello;

        return "updated ok";
    }

}