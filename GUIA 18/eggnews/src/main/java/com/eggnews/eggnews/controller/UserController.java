/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggnews.eggnews.controller;

import com.eggnews.eggnews.service.UserService;
import exception.AppException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author chris
 */
@Controller
public class UserController {
    
    @Autowired UserService userService;
    
    @GetMapping("/sign-up")
    public String signIn() {
        return "signIn.html";
    }

    @PostMapping("/register")
    public String registrer(@RequestParam String userName, @RequestParam String email,
            @RequestParam String password, @RequestParam String passwordVerification, ModelMap model) {
        try {
            userService.register(userName, email, password, passwordVerification);
            model.put("succes", "User has benn created succesfully");
            return "redirect:/index";
        } catch (AppException ex) {
            model.put("userName", userName);
            model.put("email", email);
            model.put("error", ex.getMessage());
            return "signIn.html";
        }        
    }

    @GetMapping("/login")
    public String logIn() {
        return "logIn.html";
    }

    @PostMapping("/loginChek")
    public String logincheck(@RequestParam String email, @RequestParam String password, ModelMap model) {
        System.out.println(email);
        return "index.html";
    }

    @GetMapping("/loged")
    public String loged() {
        return "index.html";
    }
    
}
