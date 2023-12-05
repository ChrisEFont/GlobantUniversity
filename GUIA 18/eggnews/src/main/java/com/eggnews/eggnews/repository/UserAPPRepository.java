/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggnews.eggnews.repository;

import com.eggnews.eggnews.entity.UserAPP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author chris
 */
@Repository
public interface UserAPPRepository extends JpaRepository<UserAPP, Long>{
    
    @Query("SELECT u FROM UserAPP u WHERE u.email = :email")
    public UserAPP findByEmail(@Param("email")String email);   
    
}
