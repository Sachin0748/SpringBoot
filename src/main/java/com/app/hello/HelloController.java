package com.app.hello;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // UC_01
    @GetMapping("/hello1")
    public String hello1(){
        return "Hello from BridgeLabz.";
    }

    // UC_02
    @GetMapping("/hello2")
    public String hello2(@RequestParam String name){
        return "Hello " + name + " from BridgeLabz.";
    }

    // UC_03
    @GetMapping("/hello3/{name}")
    public String hello3(@PathVariable String name){
        return "Hello " + name + " from BridgeLabz.";
    }

    // UC_04
    @PostMapping("/hello4")
    public String hello4(@RequestBody DTO user){
         return "Hello " + user.getFirstName() + " "+ user.getLastName() + " from BridgeLabz.";
    }

    @PutMapping("/hello5/{firstName}")
    public String hello5(@PathVariable String firstName, @RequestParam String lastName){
        return "Hello " + firstName + " "+ lastName + " from BridgeLabz.";
    }
}
