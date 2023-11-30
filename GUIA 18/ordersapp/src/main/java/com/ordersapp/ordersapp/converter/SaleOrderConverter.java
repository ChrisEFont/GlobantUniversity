/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.converter;

import com.ordersapp.ordersapp.DTO.SaleOrderDTO;
import com.ordersapp.ordersapp.entity.Client;
import com.ordersapp.ordersapp.entity.Product;
import com.ordersapp.ordersapp.entity.SaleOrder;
import enums.OrderState;
import java.util.Date;
import java.util.List;

/**
 *
 * @author chris
 */
public class SaleOrderConverter {
    
    public SaleOrderDTO saleOrderToSaleOrderDTO(SaleOrder saleOrder){
        
        int id = saleOrder.getId();
        Date orderDate = saleOrder.getOrderDate();
        Client client = saleOrder.getClient();
        List<Product> products = saleOrder.getProducts();
        OrderState state = saleOrder.getState();
        SaleOrderDTO saleOrderDTO = new SaleOrderDTO(id, orderDate, client, products, state);
        return saleOrderDTO;       
    }
    
    public SaleOrder saleOrderDTOToSaleOrder(SaleOrderDTO saleOrderDTO){
        int id = saleOrderDTO.getId();
        Date orderDate = saleOrderDTO.getOrderDate();
        Client client = saleOrderDTO.getClient();
        List<Product> products = saleOrderDTO.getProducts();
        OrderState state = saleOrderDTO.getState();
        SaleOrder saleOrder = new SaleOrder(id, orderDate, client, products, state);
        return saleOrder;        
    }
    
    
    
}
