package com.caputo.composicao.dto;

import com.caputo.composicao.entities.Order;
import com.caputo.composicao.entities.OrderStatus;
import lombok.*;

import java.time.Instant;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class OrderDTO {
    @EqualsAndHashCode.Include
    private Long id;
    private Instant moment;
    private OrderStatus status;

    public OrderDTO(Order entity){
        id = entity.getId();
        moment = entity.getMoment();
        status = entity.getStatus();
    }
}
