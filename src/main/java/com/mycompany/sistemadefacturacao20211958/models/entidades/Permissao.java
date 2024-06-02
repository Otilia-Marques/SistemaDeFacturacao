package com.mycompany.sistemadefacturacao20211958.models.entidades;

//@author Otilia Marques

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor; 

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Permissao {
    private Long id; 
    private String nome;
    private String descricao;
}