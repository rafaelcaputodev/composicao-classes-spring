package com.caputo.composicao.services;

import com.caputo.composicao.dto.OrderDTO;

import com.caputo.composicao.entities.Order;

import com.caputo.composicao.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public Page<OrderDTO> findAll(Pageable pageable){
        Page<Order> list = repository.findAll(pageable);
        return list.map(x -> new OrderDTO(x));
    }
}
