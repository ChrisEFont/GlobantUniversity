/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.service;

import com.ordersapp.ordersapp.DTO.ClientDTO;
import com.ordersapp.ordersapp.converter.ClientConverter;
import com.ordersapp.ordersapp.entity.Client;
import com.ordersapp.ordersapp.repository.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author chris
 */

@Service
public class ClientService {
    
    @Autowired
    ClientRepository clientRepository;
    
//  @Autowired
    ClientConverter clientConverter = new ClientConverter();
    
    public Client create(String name, String email, String phone){
        Client client = new Client(name, email, phone);        
        return client;
    }
    
    public void add(Client client){
        clientRepository.save(client);
    }
    
    public ClientDTO getById(int id){
        System.out.println("Service");
        Optional<Client> client = clientRepository.findById(id);
        ClientDTO clientDTO = clientConverter.clienToClientDTO(client.get());
        return clientDTO;        
    }
    
//    public List<Client>getByName(String name){
//        List<Client> clients = clientRepository.findByName(name);
//        return clients;
//    }
//    
//    public List<Client>getByEmail(String email){
//        List<Client> clients = clientRepository.findByEmail(email);
//        return clients;
//    }   
    
}
