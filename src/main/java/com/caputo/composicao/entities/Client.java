package com.caputo.composicao.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "tb_client")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private String email;

    @OneToMany
    @JoinTable(name = "tb_client_order",
            joinColumns = @JoinColumn(name = "client_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"))
    List<Order> orders = new ArrayList<>();

    public Client(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
