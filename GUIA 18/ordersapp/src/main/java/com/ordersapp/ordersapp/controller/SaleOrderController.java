/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.controller;

import com.ordersapp.ordersapp.DTO.SaleOrderDTO;
import com.ordersapp.ordersapp.entity.SaleOrder;
import com.ordersapp.ordersapp.service.SaleOrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author chris
 */

@RestController
@RequestMapping("/so")
public class SaleOrderController {
    
    @Autowired SaleOrderService saleOrderService;
    
    @GetMapping("/list")
    public List<SaleOrderDTO> getAll(){
        return saleOrderService.getAll();
    }
    
    @GetMapping("/find-id/{id}")    
    public SaleOrderDTO getById(@PathVariable int id){
        return saleOrderService.getById(id);        
    }    

    @PostMapping("/save")
    public SaleOrder save(@RequestBody SaleOrderDTO saleOrderDTO){
        return saleOrderService.save(saleOrderDTO);
    }    

    @PutMapping("/update")
    public void updateSaleOrder(@RequestBody SaleOrderDTO saleOrderDTO){
        saleOrderService.update(saleOrderDTO);
    }    
}
