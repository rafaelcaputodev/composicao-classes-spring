package com.caputo.composicao.controllers;


import com.caputo.composicao.dto.OrderItemDTO;

import com.caputo.composicao.services.OrdemItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/order-items")
public class OrderItemController {

    @Autowired
    private OrdemItemService service;

    @GetMapping
    public ResponseEntity<Page<OrderItemDTO>> findAll(Pageable pageable){
        Page<OrderItemDTO> dto = service.findAll(pageable);
        return ResponseEntity.ok(dto);
    }
}
