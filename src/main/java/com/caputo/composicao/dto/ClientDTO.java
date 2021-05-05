package com.caputo.composicao.dto;

import com.caputo.composicao.entities.Client;
import lombok.*;

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

    public ClientDTO (Client entity){
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
    }
}
