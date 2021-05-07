package com.caputo.composicao.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private Instant moment;
    private OrderStatus status;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "order")
    List<OrderItem> items = new ArrayList<>();

    public Double total(){
        Double sum = 0.0;
        for(OrderItem o : items){
            sum += o.getSubTotal();
        }
        return sum;
    }
}
