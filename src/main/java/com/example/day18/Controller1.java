package com.example.day18;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @GetMapping("/age")
    public String age(){
        return "My age is 26";
    }

    @GetMapping("/name")
    public String name(){
        return "My name is Omar";
    }
    @GetMapping("/check/status")
    public String checkStatus(){
        return "Everything OK";
    }

    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public String[] names(){
        return new String[]{"Omar","Sam","Ana","Flats"};
    }

}
