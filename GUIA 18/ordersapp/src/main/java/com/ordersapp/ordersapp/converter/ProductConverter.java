/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.converter;

import com.ordersapp.ordersapp.DTO.ProductDTO;
import com.ordersapp.ordersapp.entity.Product;

/**
 *
 * @author chris
 */
public class ProductConverter {
    
    public ProductDTO productToProductDTO(Product product){        
    int id = product.getId();
    int stock = product.getStock();
    String name = product.getName();
    float price = product.getPrice();
    boolean active = product.isActive();    
    ProductDTO productDTO = new ProductDTO(id, stock, name, price, active);
    return productDTO;   
    }

    public Product productDTOToProduct(ProductDTO productDTO) {
        int id = productDTO.getId();
        int stock = productDTO.getStock();
        String name = productDTO.getName();
        float price = productDTO.getPrice();
        boolean active = productDTO.isActive();
        Product product = new Product(id, stock, name, price, active);
        return product;
    }
    
}
