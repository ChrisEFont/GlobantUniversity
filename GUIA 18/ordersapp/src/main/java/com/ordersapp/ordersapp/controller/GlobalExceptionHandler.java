///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.ordersapp.ordersapp.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
///**
// *
// * @author chris
// */
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//    
//    public static final String INTERNAL_ERROR_CUSTOM_MESSAGE = "... whatever internal error happened ...";
//
//    /**
//     * this method catches every exception to send a custom error json response
//     */
//    @ExceptionHandler(Exception.class) //checkForEveryException
//    @ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Id does not exist")
//    public void NonClientException(Exception e) {
//        System.out.println(e.getMessage());
//    }
//    
//    
//}
