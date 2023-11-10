/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggnews.eggnews.service;

import com.eggnews.eggnews.entity.Notice;
import com.eggnews.eggnews.repository.NoticeRepository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author chris
 */

@Service
public class NoticeService {
    
    @Autowired
    private NoticeRepository noticeRepository;
    
    @Transactional    
    public void createNotice(String title, String text, Boolean visible){
        
        Notice notice = new Notice();        
        notice.setTitle(title);
        notice.setNoticeText(text);
        notice.setVisible(visible);
        notice.setNoticeDate(new Date());
        noticeRepository.save(notice);
    }
    
    public List<Notice> getNotices(){
        List<Notice> notices = noticeRepository.findAll();
        return notices;
    }
    
    public Notice getNoticeById(int id){
    Optional<Notice> response = noticeRepository.findById(id);
    response = noticeRepository.findById(id);
    return response.get();
    }
    
    @Transactional    
    public void editNotice(int id, String title, String text, Boolean visible) {
        
        Optional<Notice> response = noticeRepository.findById(id);
        
        System.out.println("**************Service***************");
        System.out.println(id);
        System.out.println(title);
        System.out.println(text);
        System.out.println(visible);
        
        
        if(response.isPresent()){
           Notice notice = response.get();
           notice.setTitle(title);
           notice.setNoticeText(text);
           notice.setVisible(visible);
           noticeRepository.save(notice);
        }        
    }
    
    
    
}
