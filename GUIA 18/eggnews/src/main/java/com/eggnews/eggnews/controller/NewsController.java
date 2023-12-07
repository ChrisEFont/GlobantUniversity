/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggnews.eggnews.controller;

import com.eggnews.eggnews.entity.Notice;
import com.eggnews.eggnews.service.NoticeService;
import com.eggnews.eggnews.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author chris
 */

@Controller
@RequestMapping("/")
public class NewsController {
    
    @Autowired
    private NoticeService noticeService;
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/")
    public String index(ModelMap model){
        List<Notice> notices = noticeService.getNotices();
        model.addAttribute("notices", notices);
        return "index.html";        
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping ("/admin")
    public String adminPanel(ModelMap model){
        List<Notice> notices = noticeService.getNotices();
        model.addAttribute("notices", notices);     
        return "adminPanel.html";
    }
    
    @PostMapping("/admin/addNotice")
    public String addNotice(@RequestParam String title, String text, String visible){
        if(visible != null){
            noticeService.createNotice(title, text, true); 
        }else{
            noticeService.createNotice(title, text, false); 
        }
        return "adminPanel.html";
    }
    
    @GetMapping("/admin/editNotice")
    public String editNotice(Integer id, ModelMap model){
        Notice notice = noticeService.getNoticeById(id);
        System.out.println(id);
        model.addAttribute(notice);
        return "editNotice.html";
    }
    
    @PostMapping("/admin/saveChanges")
    public String saveChanges(@RequestParam Integer id, String title, String text, String visible){
        System.out.println(title);
        
        if(visible != null){
            noticeService.editNotice(id, title, text, true);            
        }else{
            noticeService.editNotice(id, title, text, false);
        }                
        return "adminPanel.html";
    }
    
    @GetMapping("/admin/deleteNotice")
    public String deleteNotice(Integer id, ModelMap model){
//        Notice notice = noticeService.getNoticeById(id);
        System.out.println(id);
        noticeService.deleteNotice(id);
        return "adminPanel.html";
    }
    
    @GetMapping("/sign-in")
    public String signIn(){
        return "signIn.html";
    }
    
    @PostMapping("/register")
    public String registrer(@RequestParam String userName, @RequestParam String email, @RequestParam String password, ModelMap model){        
        userService.register(userName, email, password);
        return "index.html";
    }
    
    @GetMapping("/login")
    public String logIn(){
        return "logIn.html";
    }
    
    @PostMapping("/loginChek")
    public String logincheck(@RequestParam String email, @RequestParam String password, ModelMap model){
        return "index.html";
    }
    
    @GetMapping("/loged")
    public String loged(){
       return "index.html";
    }
    
}
