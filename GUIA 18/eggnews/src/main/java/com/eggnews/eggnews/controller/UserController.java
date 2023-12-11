package com.eggnews.eggnews.controller;

import com.eggnews.eggnews.service.UserService;
import exception.AppException;
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
        return "sign_up.html";
    }

    @PostMapping("/register")
    public String registrer(@RequestParam String userName, @RequestParam String email,
            @RequestParam String password, @RequestParam String passwordVerification, ModelMap model) {
        try {
            userService.register(userName, email, password, passwordVerification);
            model.put("succes", "User has benn created succesfully");
            return "login.html";
        } catch (AppException ex) {
            model.put("userName", userName);
            model.put("email", email);
            model.put("error", ex.getMessage());
            return "sign_up.html";
        }        
    }

    @GetMapping("/login")
    public String logIn(@RequestParam(required=false) String error, ModelMap model) {
        if(error != null){
            model.put("error", "Wrong email or password");
        }
        return "login.html";
    }

    @GetMapping("/loged")
    public String loged(ModelMap model) {
        return "index.html";
    }
    
}
