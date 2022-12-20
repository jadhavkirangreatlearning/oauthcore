package com.csi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("WELCOME TO FINTECH CSI PUNE");
    }

    @GetMapping("/services")
    public String sayServices(){
        return "SOFTWARE DEVELOPMENT";
    }

    @GetMapping("/user")
    public Principal getUserDetails(Principal principal){
        return principal;
    }
}
