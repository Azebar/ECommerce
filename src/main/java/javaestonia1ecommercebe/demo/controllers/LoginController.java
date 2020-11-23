package javaestonia1ecommercebe.demo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
public class LoginController {

    final UserDetailsService userDetailsService;

    @PostMapping("/validatelogin")
    Boolean validateLogin(){
        return true;
    }
}