package com.eggnews.eggnews.controller;

import com.eggnews.eggnews.entity.Notice;
import com.eggnews.eggnews.service.NoticeService;
import java.util.List;
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
@RequestMapping("/index/")
public class IndexController {
    
    @Autowired NoticeService noticeService;
    
    @GetMapping("")
    public String index(ModelMap model) {
        List<Notice> notices = noticeService.getNotices();
        notices.sort(Notice.compareId);
        model.addAttribute("notices", notices);
        model.put("place", "home");
        return "index.html";
    }
    
}
