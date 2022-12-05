package com.example.libraryapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @PostMapping("/")
    public String Welcome(){
        return "Welcome to product website";
    }

    @PostMapping("/adminlogin")
    public String adminlogin(){
        return "Welcome to admin login";
    }

    @PostMapping("/userlogin")
    public String userlogin(){
        return "Welcome to user login";
    }
}
