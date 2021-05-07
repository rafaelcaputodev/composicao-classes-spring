package com.caputo.composicao.services;

import com.caputo.composicao.dto.OrderItemDTO;

import com.caputo.composicao.entities.OrderItem;

import com.caputo.composicao.repositories.OrderItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdemItemService {

    @Autowired
    private OrderItemRepository repository;

    @Transactional(readOnly = true)
    public Page<OrderItemDTO> findAll(Pageable pageable){
        Page<OrderItem> list = repository.findAll(pageable);
        return list.map(x -> new OrderItemDTO(x));
    }
}
