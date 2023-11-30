/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.repository;

import com.ordersapp.ordersapp.entity.SaleOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author chris
 */

@Repository
public interface SaleOrderRepository extends JpaRepository<SaleOrder, Integer>{
    
}
