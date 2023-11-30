/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.repository;

import com.ordersapp.ordersapp.entity.Client;
import com.ordersapp.ordersapp.entity.Product;
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
public interface ProductRepository extends JpaRepository<Product, Integer>{
    
    @Query("select p from Product p where p.name Like :name")
    public List<Product> findByName(@Param("name")String name);
    
}
