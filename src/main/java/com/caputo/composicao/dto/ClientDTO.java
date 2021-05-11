package com.caputo.composicao.dto;

import com.caputo.composicao.entities.Client;
import com.caputo.composicao.entities.Order;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ClientDTO {

    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private String email;
    private List<Order> orders = new ArrayList<>();

    public ClientDTO (Client entity){
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        orders = entity.getOrders();
    }
}
