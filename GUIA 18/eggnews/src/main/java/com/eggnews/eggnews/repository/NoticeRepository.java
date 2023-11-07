/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggnews.eggnews.repository;

import com.eggnews.eggnews.entity.Notice;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author chris
 */

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Integer> {    
    
    @Query("select n from Notice n where n.title =: title")
    public List<Notice> findByTitle(@Param("title") String title);
    
}
