/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggnews.eggnews.service;

import com.eggnews.eggnews.entity.UserAPP;
import com.eggnews.eggnews.enums.Rol;
import com.eggnews.eggnews.repository.UserAPPRepository;

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
    private UserAPPRepository userAPPRepository;
    
    @Transactional
    public void register(String name, String email, String password){
        
        System.out.println(name + password + email );
        
        UserAPP userAPP = new UserAPP();
        
        userAPP.setName(name);
        userAPP.setEmail(email);
        userAPP.setPassword(password);
        userAPP.setRol(Rol.USER);
        
        userAPPRepository.save(userAPP);
        
        System.out.println(userAPP.toString());
        
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        
        UserAPP userAPP = userAPPRepository.findByEmail(email);
        
        if(userAPP != null){
            List<GrantedAuthority> permissions = new ArrayList<>();
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + userAPP.getRol().toString());
            permissions.add(p);
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession session = attr.getRequest().getSession(true);
            session.setAttribute("user", p);
            return new User(userAPP.getEmail(), userAPP.getPassword(), permissions);
        }else{
            return null;
        }        
    }    
}
