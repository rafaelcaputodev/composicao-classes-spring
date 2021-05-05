package com.caputo.composicao.dto;

import com.caputo.composicao.entities.Product;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ProductDTO {
    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private Double price;

    public ProductDTO(Product entity){
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
    }
}
