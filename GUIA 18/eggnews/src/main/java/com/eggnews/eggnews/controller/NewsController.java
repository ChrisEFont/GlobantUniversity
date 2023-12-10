package com.eggnews.eggnews.controller;

import com.eggnews.eggnews.service.NoticeService;
import com.eggnews.eggnews.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author chris
 */

@Controller
//@RequestMapping("/")
public class NewsController {
    
    @Autowired
    private NoticeService noticeService;
    
    @Autowired
    private UserService userService;
    
    @GetMapping()
    public String index(ModelMap model){
        return "redirect:/index/";        
    }   
}
