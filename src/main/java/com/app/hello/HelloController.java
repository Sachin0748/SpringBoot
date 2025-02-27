package com.app.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello1")
    public String hello1(){
        return "Hello from BridgeLabz.";
    }

    @RequestMapping("/hello2")
    public String hello2(@RequestParam String name){
        return "Hello " + name + " from BridgeLabz.";
    }

    
}
