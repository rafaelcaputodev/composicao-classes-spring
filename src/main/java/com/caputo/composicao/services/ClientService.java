package com.caputo.composicao.services;

import com.caputo.composicao.dto.ClientDTO;
import com.caputo.composicao.dto.ProductDTO;
import com.caputo.composicao.entities.Client;
import com.caputo.composicao.entities.Product;
import com.caputo.composicao.repositories.ClientRepository;
import com.caputo.composicao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public List<ClientDTO> findAll(){
        List<Client> list = repository.findAll();
        return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
    }
}
