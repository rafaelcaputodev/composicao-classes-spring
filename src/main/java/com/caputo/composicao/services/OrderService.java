package com.caputo.composicao.services;

import com.caputo.composicao.dto.OrderDTO;
import com.caputo.composicao.dto.ProductDTO;
import com.caputo.composicao.entities.Order;
import com.caputo.composicao.entities.Product;
import com.caputo.composicao.repositories.OrderRepository;
import com.caputo.composicao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public List<OrderDTO> findAll(){
        List<Order> list = repository.findAll();
        return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
    }
}
