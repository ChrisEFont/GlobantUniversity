/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.service;

import com.ordersapp.ordersapp.DTO.ProductDTO;
import com.ordersapp.ordersapp.converter.ProductConverter;
import com.ordersapp.ordersapp.entity.Product;
import com.ordersapp.ordersapp.repository.ProductRepository;
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
public class ProductService {
    
    @Autowired
    ProductRepository productRepository;
    
    ProductConverter productConverter = new ProductConverter();
    
    public ProductDTO getById(int id){        
        Optional<Product> product = productRepository.findById(id);
        return productConverter.productToProductDTO(product.get()) ;
    }
    
    public List<ProductDTO> getAll(){
        List<Product> products = productRepository.findAll();
        ProductDTO productDTO;
        List<ProductDTO> productDTOS = new ArrayList();
        for(Product p: products){
            productDTO = productConverter.productToProductDTO(p);
            productDTOS.add(productDTO);
        }
        return productDTOS;
    }
    
    public List<ProductDTO> getByName(String name){
        List<Product> products = productRepository.findByName(name);
        ProductDTO productDTO;
        List<ProductDTO> productDTOS = new ArrayList();
        for(Product p: products){
            productDTO = productConverter.productToProductDTO(p);
            productDTOS.add(productDTO);
        }
        return productDTOS;        
    }
    
    @Transactional
    public Product save(ProductDTO productDTO){
        Product product = productConverter.productDTOToProduct(productDTO);
        return productRepository.save(product);
    }
    
    @Transactional
    public void update(ProductDTO productDTO){
        Product product = productConverter.productDTOToProduct(productDTO);
        productRepository.save(product);        
    }   
}
