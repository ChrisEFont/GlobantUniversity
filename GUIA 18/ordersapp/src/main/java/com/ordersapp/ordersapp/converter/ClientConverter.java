/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.converter;

import com.ordersapp.ordersapp.DTO.ClientDTO;
import com.ordersapp.ordersapp.entity.Client;
import javax.persistence.Converter;

/**
 *
 * @author chris
 */


public class ClientConverter {
    
    public ClientDTO clienToClientDTO(Client client){
        int id = client.getId();
        String name = client.getName();
        String email = client.getEmail();
        String phone = client.getPhone();
        Boolean active = client.isActive();        
        ClientDTO clientDTO = new ClientDTO(id, name, email, phone, active);
        return clientDTO;
    }
    
    public Client clientDTOToClient(ClientDTO clientDTO){
        int id = clientDTO.getId();
        String name= clientDTO.getName();
        String email = clientDTO.getEmail();
        String phone = clientDTO.getPhone();
        Boolean active = clientDTO.isActive();
        Client client = new Client(name, email, phone);
        return client;
    }
    
}
