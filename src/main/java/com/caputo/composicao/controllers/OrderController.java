package com.caputo.composicao.controllers;


import com.caputo.composicao.dto.OrderDTO;

import com.caputo.composicao.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<Page<OrderDTO>> findAll(Pageable pageable){
        Page<OrderDTO> dto = service.findAll(pageable);
        return ResponseEntity.ok(dto);
    }
}
