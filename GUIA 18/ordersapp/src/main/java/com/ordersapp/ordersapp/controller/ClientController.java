/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.controller;

import com.ordersapp.ordersapp.DTO.ClientDTO;
import com.ordersapp.ordersapp.converter.ClientConverter;
import com.ordersapp.ordersapp.entity.Client;
import com.ordersapp.ordersapp.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





/**
 *
 * @author chris
 */

@RestController
@RequestMapping("/client")

public class ClientController {
    
    @Autowired
    private ClientService clientService;
        
//    @Autowired
    
    private ClientConverter clientConverter = new ClientConverter();
    
    @GetMapping("/create")
    public ClientDTO createClient(String name, String email, String phone){
        Client client = clientService.create(name, email, phone); 
        clientService.add(client);
        ClientDTO clientDTO = clientConverter.clienToClientDTO(client);
        return clientDTO;
    }
    
        @GetMapping("/getall")
    public List<Client> getAll(){
    return clientService.getAll();        
    }    
    
    
    @GetMapping("/getbyid/{id}")
    public ClientDTO getById(@PathVariable int id){
        return clientService.getById(id);
    }
    
    @GetMapping("/getbyname/{name}")
    public List<Client> getByName(@PathVariable String name){
        return clientService.getByName(name);
    }
    
    @GetMapping("/getbyemail/{email}")
    public List<Client> getByEmail(@PathVariable String email) {
        return clientService.getByEmail(email);
    }    
}
