/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.service;

import com.ordersapp.ordersapp.DTO.SaleOrderDTO;
import com.ordersapp.ordersapp.converter.SaleOrderConverter;
import com.ordersapp.ordersapp.entity.SaleOrder;
import com.ordersapp.ordersapp.repository.SaleOrderRepository;
import java.util.ArrayList;
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
public class SaleOrderService {
    
    @Autowired
    SaleOrderRepository saleOrderRepository;
    
    SaleOrderConverter saleOrderConverter = new SaleOrderConverter();
    
    public List<SaleOrderDTO> getAll(){
        List<SaleOrder> saleOrders;
        List<SaleOrderDTO> saleOrderDTOS = new ArrayList();
        SaleOrder saleOrder;
        SaleOrderDTO saleOrderDTO;        
        saleOrders = saleOrderRepository.findAll();
        for(SaleOrder s: saleOrders){
            saleOrderDTO = saleOrderConverter.saleOrderToSaleOrderDTO(s);
            saleOrderDTOS.add(saleOrderDTO);
        }
        return saleOrderDTOS;        
    }
    
    public SaleOrderDTO getById(int id){
        Optional<SaleOrder> saleOrder = saleOrderRepository.findById(id);
        SaleOrderDTO saleOrderDTO = saleOrderConverter.saleOrderToSaleOrderDTO(saleOrder.get());
        return saleOrderDTO;        
    }
    
    @Transactional
    public SaleOrder save(SaleOrderDTO saleOrderDTO){
        SaleOrder saleOrder = saleOrderConverter.saleOrderDTOToSaleOrder(saleOrderDTO);        
        return saleOrderRepository.save(saleOrder);
    }
    
    @Transactional
    public void update(SaleOrderDTO saleOrderDTO){
        SaleOrder saleOrder;
        saleOrder = saleOrderConverter.saleOrderDTOToSaleOrder(saleOrderDTO);
        saleOrderRepository.save(saleOrder);        
    }
    
}
