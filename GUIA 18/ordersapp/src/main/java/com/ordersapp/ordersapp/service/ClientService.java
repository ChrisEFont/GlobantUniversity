/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.service;

import com.ordersapp.ordersapp.DTO.ClientDTO;
import com.ordersapp.ordersapp.converter.ClientConverter;
import com.ordersapp.ordersapp.entity.Client;
import com.ordersapp.ordersapp.exception.NonClientException;
import com.ordersapp.ordersapp.repository.ClientRepository;
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
public class ClientService {    
    
    @Autowired
    ClientRepository clientRepository;    

    ClientConverter clientConverter = new ClientConverter();
        
    public ClientDTO getById(int id){
        System.out.println("Service");
        Optional<Client> client = clientRepository.findById(id);
        ClientDTO clientDTO = clientConverter.clienToClientDTO(client.get());
        return clientDTO;        
    }
    
    public List<ClientDTO> getAll(){
        List<Client> clients = new ArrayList();
        ClientDTO clientDTO = new ClientDTO();
        List<ClientDTO> clientDTOS = new ArrayList();
        clients = clientRepository.findAll();
        for (Client c : clients) {
            clientDTO = clientConverter.clienToClientDTO(c);
            clientDTOS.add(clientDTO);
        }
        return clientDTOS;     
    }
    
    public List<ClientDTO> getByName(String name){
        List<Client> clients = new ArrayList();
        ClientDTO clientDTO = new ClientDTO();
        List<ClientDTO> clientDTOS = new ArrayList();
        clients = clientRepository.findByName("%" + name + "%");
        for (Client c : clients) {
            clientDTO = clientConverter.clienToClientDTO(c);
            clientDTOS.add(clientDTO);
        }
        return clientDTOS;
    }
    
    public List<ClientDTO> getByEmail(String email){
        List<Client> clients = new ArrayList();
        ClientDTO clientDTO = new ClientDTO();
        List<ClientDTO> clientDTOS = new ArrayList();
        clients = clientRepository.findByEmail("%" + email + "%");
        for (Client c : clients) {
            clientDTO = clientConverter.clienToClientDTO(c);
            clientDTOS.add(clientDTO);
        }
        return clientDTOS;
    }
    
    @Transactional
    public Client save(ClientDTO clientDTO){
        Client client = new Client();
        client = clientConverter.clientDTOToClient(clientDTO);
        return clientRepository.save(client);        
    }
    
    @Transactional
    public void update(ClientDTO clientDTO) throws NonClientException{
        if (clientRepository.existsById(clientDTO.getId())) {
            Client client = clientConverter.clientDTOToClient(clientDTO);
            clientRepository.save(client);
        } else {
            throw new NonClientException("Id does not exist");
        }
    }    
}
