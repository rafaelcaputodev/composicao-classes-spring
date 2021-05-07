package com.caputo.composicao.entities;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tb_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private Double price;

    @OneToOne
    @JoinColumn(name = "order_item_id")
    private OrderItem orderItem;
}
