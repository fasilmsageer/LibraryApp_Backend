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

    @PostMapping("/useregistration")
    public String userregistration(){
        return "Welcome to userregistration";
    }

    @PostMapping("/addbook")
    public String addbook(){
        return "Welcome to addbook";
    }

    @PostMapping("/searchbook")
    public String searchbook(){
        return "Welcome to searchbook";
    }

    @PostMapping("/deletebook")
    public String deletebook(){
        return "Welcome to deletebook";
    }

    @GetMapping("/viewbook")
    public String viewbook(){
        return "Welcome to viewbook";
    }

    @PostMapping("/editbook")
    public String editbook(){
        return "Welcome to editbook";
    }
}
