/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

import com.mycompany.pojos.Product;
import com.mycompany.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC
 */
@RestController
public class ApiCartCoController {
    @Autowired
    private ProductService productService;
    
    
    @GetMapping("/api/products")
    public ResponseEntity<List<Product>> listProducts(){
        List<Product> products = this.productService.getProducts("", 1);
        
         return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
