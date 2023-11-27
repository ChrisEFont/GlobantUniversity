/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.controller;

import com.ordersapp.ordersapp.DTO.ProductDTO;
import com.ordersapp.ordersapp.entity.Product;
import com.ordersapp.ordersapp.service.ProductService;
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
@RequestMapping("/products")

public class ProductController {
    
    @Autowired
    ProductService productService;
    
    @GetMapping("/list")
    public List<ProductDTO> getAll(){
        return productService.getAll();
    }
    
    @GetMapping("/fin-id/{id}")
    public ProductDTO getById(@PathVariable int id){
        return productService.getById(id);
    }
    
    @GetMapping("/find-name/{name}")
    public List<ProductDTO> getByName(@PathVariable String name){
        return productService.getByName(name);
    }
    
    @PostMapping("/save")
    public Product saveProduct(@RequestBody ProductDTO productDTO){
        return productService.save(productDTO);
    }
    
    @PutMapping("/update")
    public void updateProduct(@RequestBody ProductDTO productDTO){
        productService.update(productDTO);
    }    
}
