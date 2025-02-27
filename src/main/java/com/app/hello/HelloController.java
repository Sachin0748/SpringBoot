package com.app.hello;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello1")
    public String hello1(){
        return "Hello from BridgeLabz.";
    }

    @GetMapping("/hello2")
    public String hello2(@RequestParam String name){
        return "Hello " + name + " from BridgeLabz.";
    }

}
