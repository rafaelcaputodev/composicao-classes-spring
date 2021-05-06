package com.caputo.composicao.services;

import com.caputo.composicao.dto.OrderItemDTO;
import com.caputo.composicao.dto.ProductDTO;
import com.caputo.composicao.entities.OrderItem;
import com.caputo.composicao.entities.Product;
import com.caputo.composicao.repositories.OrderItemRepository;
import com.caputo.composicao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdemItemService {

    @Autowired
    private OrderItemRepository repository;

    @Transactional(readOnly = true)
    public List<OrderItemDTO> findAll(){
        List<OrderItem> list = repository.findAll();
        return list.stream().map(x -> new OrderItemDTO(x)).collect(Collectors.toList());
    }
}
