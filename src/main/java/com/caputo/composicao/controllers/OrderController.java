package com.caputo.composicao.controllers;

import com.caputo.composicao.dto.ClientDTO;
import com.caputo.composicao.dto.OrderDTO;
import com.caputo.composicao.services.ClientService;
import com.caputo.composicao.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<OrderDTO>> findAll(){
        List<OrderDTO> dto = service.findAll();
        return ResponseEntity.ok(dto);
    }
}
