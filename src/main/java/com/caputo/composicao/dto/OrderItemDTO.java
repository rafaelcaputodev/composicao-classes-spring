package com.caputo.composicao.dto;

import com.caputo.composicao.entities.OrderItem;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class OrderItemDTO {

    @EqualsAndHashCode.Include
    private Long id;
    private Integer quantity;
    private Double price;

    public OrderItemDTO(OrderItem entity){
        id = entity.getId();
        quantity = entity.getQuantity();
        price = entity.getPrice();
    }
}
