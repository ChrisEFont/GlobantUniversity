/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggnews.eggnews.controller;

import com.eggnews.eggnews.entity.Notice;
import com.eggnews.eggnews.service.NoticeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @GetMapping("/")
    public String index(ModelMap model){
        List<Notice> notices = noticeService.getNotices();
        model.addAttribute("notices", notices);
        return "index.html";        
    }
    
    @GetMapping ("/admin")
    public String adminPanel(){
        return "AdminPanel.html";
    }
    
    @PostMapping("/admin/addNotice")
    public String addNotice(@RequestParam String title, String text, String visible){
        if(visible != null){
            noticeService.createNotice(title, text, true); 
        }else{
            noticeService.createNotice(title, text, false); 
        }
        System.out.println(visible);
        return "AdminPanel.html";
    }
    
    
    
}
