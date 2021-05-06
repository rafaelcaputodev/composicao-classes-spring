package com.caputo.composicao.controllers;

import com.caputo.composicao.dto.ClientDTO;
import com.caputo.composicao.dto.OrderItemDTO;
import com.caputo.composicao.services.ClientService;
import com.caputo.composicao.services.OrdemItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class OrderItemController {

    @Autowired
    private OrdemItemService service;

    @GetMapping
    public ResponseEntity<List<OrderItemDTO>> findAll(){
        List<OrderItemDTO> dto = service.findAll();
        return ResponseEntity.ok(dto);
    }
}
