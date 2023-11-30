/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.DTO;

import com.ordersapp.ordersapp.entity.Client;
import com.ordersapp.ordersapp.entity.Product;
import enums.OrderState;
import java.util.Date;
import java.util.List;

/**
 *
 * @author chris
 */
public class SaleOrderDTO {
    
    private int id;
    private Date orderDate;    
    private Client client;    
    private List<Product> products;   
    private OrderState state;

    public SaleOrderDTO() {
    }

    public SaleOrderDTO(int id, Date orderDate, Client client, List<Product> products, OrderState state) {
        this.id = id;
        this.orderDate = orderDate;
        this.client = client;
        this.products = products;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }    
    
}
