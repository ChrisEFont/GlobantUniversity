/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.service;

import com.ordersapp.ordersapp.DTO.SaleOrderDTO;
import com.ordersapp.ordersapp.converter.SaleOrderConverter;
import com.ordersapp.ordersapp.entity.Client;
import com.ordersapp.ordersapp.entity.Product;
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
    
    public SaleOrderDTO getById(int id){
        Optional<SaleOrder> saleOrder = saleOrderRepository.findById(id);
        SaleOrderDTO saleOrderDTO = saleOrderConverter.saleOrderToSaleOrderDTO(saleOrder.get());
        return saleOrderDTO;        
    }
    
    @Transactional
    public SaleOrder save(){
        //SaleOrder saleOrder = saleOrderConverter.saleOrderDTOToSaleOrder(saleOrderDTO);
        Product p1 = new Product();
        p1.setId(1);
        Product p2 = new Product();
        p2.setId(2);
        List<Product> prod = new ArrayList();
        prod.add(p1);
        prod.add(p2);
        
        Client client = new Client();
        
        client.setId(1);
        client.setName("Cosme Fulanito");
        
        SaleOrder saleOrder = new SaleOrder();
        
        saleOrder.setProducts(prod);
        saleOrder.setClient(client);
        
        return saleOrderRepository.save(saleOrder);
    }

    
}
