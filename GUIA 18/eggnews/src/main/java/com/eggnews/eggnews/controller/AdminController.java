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
//@PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
@RequestMapping("/admin")
public class AdminController {
    
    @Autowired NoticeService noticeService;
    
    @GetMapping("/")
    public String adminPanel(ModelMap model) {
        model.put("place", "admin");
        List<Notice> notices = noticeService.getNotices();
        model.addAttribute("notices", notices);
        return "adminPanel.html";
    }
    
    @PostMapping("/addNotice")
    public String addNotice(@RequestParam String title, String text, String visible){
        if(visible != null){
            noticeService.createNotice(title, text, true); 
        }else{
            noticeService.createNotice(title, text, false); 
        }
        return "adminPanel.html";
    }
    
    @GetMapping("/editNotice")
    public String editNotice(Integer id, ModelMap model) {
        Notice notice = noticeService.getNoticeById(id);
        System.out.println(id);
        model.addAttribute(notice);
        return "editNotice.html";
    }
    
    @PostMapping("/saveChanges")
    public String saveChanges(@RequestParam Integer id, String title, String text, String visible) {
        System.out.println(title);

        if (visible != null) {
            noticeService.editNotice(id, title, text, true);
        } else {
            noticeService.editNotice(id, title, text, false);
        }
        return "redirect:/admin/";
    }
    
    @GetMapping("/admin/deleteNotice")
    public String deleteNotice(Integer id, ModelMap model) {
        System.out.println(id);
        noticeService.deleteNotice(id);
        return "adminPanel.html";
    }
    
    
    
}
