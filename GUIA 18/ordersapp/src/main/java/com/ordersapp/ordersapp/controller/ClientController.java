/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordersapp.ordersapp.controller;

import com.ordersapp.ordersapp.DTO.ClientDTO;
import com.ordersapp.ordersapp.entity.Client;
import com.ordersapp.ordersapp.exception.NonClientException;
import com.ordersapp.ordersapp.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author chris
 */

@RestController
@RequestMapping("/clients")

public class ClientController {
    
    @Autowired
    private ClientService clientService;
    //private ClientService clientService = new ClientService();
    
    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)    
    public List<ClientDTO> getAll(){
    return clientService.getAll();        
    }    
    
    @GetMapping("/find-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ClientDTO getById(@PathVariable int id){
        return clientService.getById(id);
    }
    
    @GetMapping("/find-name/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<ClientDTO> getByName(@PathVariable String name){
        return clientService.getByName(name);
    }
    
    @GetMapping("/find-email/{email}")
    @ResponseStatus(HttpStatus.OK)
    public List<ClientDTO> getByEmail(@PathVariable String email) {
        return clientService.getByEmail(email);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client saveClient(@RequestBody ClientDTO clientDTO){
        return clientService.save(clientDTO);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateClient(@RequestBody ClientDTO clientDTO) throws Exception{
        clientService.update(clientDTO);
    }
    
    @ExceptionHandler(NonClientException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleException(NonClientException e){
        return e.getMessage();
    }
    
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String errorReponse(Exception e) {
        return "Se ha producido un error";
    }
    
    @GetMapping("/prueba")
    @ResponseStatus(HttpStatus.TEMPORARY_REDIRECT)
    public String prueba(){
        return "Se devuelve este string";
    }
}
