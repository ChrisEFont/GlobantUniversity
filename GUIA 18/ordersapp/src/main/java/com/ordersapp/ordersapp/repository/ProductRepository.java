/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.repository;

import com.ordersapp.ordersapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author chris
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
