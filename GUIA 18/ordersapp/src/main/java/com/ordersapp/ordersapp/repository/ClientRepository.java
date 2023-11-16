/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.repository;

import com.ordersapp.ordersapp.entity.Client;
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
public interface ClientRepository extends JpaRepository<Client, Integer>{
    
    @Query("select c from Client c where c.name like=: name")
    public List<Client> findByName(@Param("%name%")String name);
    
    @Query("select c from Client where c.email like=: email")
    public List<Client> findByEmail(@Param("%email%")String email);
    
}
