package com.caputo.composicao.services;

import com.caputo.composicao.dto.ClientDTO;

import com.caputo.composicao.entities.Client;

import com.caputo.composicao.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable){
        Page<Client> list = repository.findAll(pageable);
        return list.map(x -> new ClientDTO(x));
    }
}
