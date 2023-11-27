/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.DTO;

/**
 *
 * @author chris
 */
public class ProductDTO {
    
    private int id;
    private int stock;
    private String name;
    private float price;
    boolean active;

    public ProductDTO() {
    }

    public ProductDTO(int id, int stock, String name, float price, boolean active) {
        this.id = id;
        this.stock = stock;
        this.name = name;
        this.price = price;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    

    
}
