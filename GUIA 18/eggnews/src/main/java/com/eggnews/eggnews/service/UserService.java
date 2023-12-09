/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggnews.eggnews.service;

import com.eggnews.eggnews.entity.AppUser;
import com.eggnews.eggnews.enums.Rol;
import com.eggnews.eggnews.repository.AppUserRepository;
import com.eggnews.eggnews.utilities.PasswordValidator;
import exception.AppException;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *
 * @author chris
 */

@Service
public class UserService implements UserDetailsService{
    
    @Autowired
    private AppUserRepository appUserRepository;
    
    @Transactional
    public void register(String name, String email, String password, String passwordVerification) throws AppException{
        
        validate(name, email, password, passwordVerification);
        
        AppUser appUser = new AppUser();
        
        appUser.setName(name);
        appUser.setEmail(email);
        appUser.setPassword(new BCryptPasswordEncoder().encode(password));
        appUser.setRol(Rol.USER);
        
        appUserRepository.save(appUser);        
    }
    
    private void validate(String name, String email, String password, String passwordVerification) throws AppException{
        
        if(name.isEmpty() || name == null){
            throw new AppException("The name can not be null or empty");            
        }
        
        if(email.isEmpty() || email == null){
            throw new AppException("The email can not be null or empty");
        }
        
        switch(PasswordValidator.validate(password, passwordVerification)){
            case 1:
                throw new AppException("The password can not be null or empty");
            case 2:
                throw new AppException("The must have 8 character at least");
            case 3:
                throw new AppException("The passwords does not match");
            case 4:
                throw new AppException("The password must contains a number");
            case 5:
                throw new AppException("The password must contains a upper case");
            case 6:
                throw new AppException("The password must constains a lower case");
            case 0:           
        }
        
        if(appUserRepository.findByEmail(email)!=null){
            throw new AppException("The email has already been registered");
        }
    }
    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        
        AppUser appUser = appUserRepository.findByEmail(email);
        
        if(appUser != null){            
            List<GrantedAuthority> permissions = new ArrayList<>();
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + appUser.getRol().toString());            
            permissions.add(p);            
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession session = attr.getRequest().getSession(true);
            session.setAttribute("usersession", appUser);
            return new User(appUser.getEmail(), appUser.getPassword(), permissions);            
        }else{            
            return null;            
        }        
    }    
}
