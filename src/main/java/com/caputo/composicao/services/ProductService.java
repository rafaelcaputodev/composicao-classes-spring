package com.caputo.composicao.services;

import com.caputo.composicao.dto.ProductDTO;
import com.caputo.composicao.entities.Product;
import com.caputo.composicao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable){
        Page<Product> list = repository.findAll(pageable);
        return list.map(x -> new ProductDTO(x));
    }
}
