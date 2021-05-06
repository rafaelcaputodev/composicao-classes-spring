package com.caputo.composicao.controllers;

import com.caputo.composicao.dto.ClientDTO;
import com.caputo.composicao.entities.Client;
import com.caputo.composicao.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping
    public ResponseEntity<List<ClientDTO>> findAll(){
        List<ClientDTO> dto = service.findAll();
        return ResponseEntity.ok(dto);
    }
}
