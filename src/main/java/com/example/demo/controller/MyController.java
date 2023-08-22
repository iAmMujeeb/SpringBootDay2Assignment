package com.example.demo.controller;


import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MyController {

    @RequestMapping(value = {"", "/", "/home"})
    public String messageHello(){
        return "Hello From Mujeeb!";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String messageHelloQuery(@RequestParam(value = "name") String name){
        return "hello "+name+"!";
    }

    @GetMapping("/param/{name}")
    public String messageHelloParam(@PathVariable String name){
        return "hello "+name+"!";
    }

    @PostMapping("/post")
    public String messageHelloPost(@RequestBody User user){
        return "Hello "+user.getFirstName()+" "+user.getLastName()+"!";
    }

    @PutMapping("/put/{firstName}")
    public String messageHelloPut(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
    return "Hello " +firstName+" "+lastName+"!";
    }
}
