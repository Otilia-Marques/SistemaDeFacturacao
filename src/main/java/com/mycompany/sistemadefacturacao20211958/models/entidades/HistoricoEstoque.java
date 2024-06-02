package com.mycompany.sistemadefacturacao20211958.models.entidades;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class HistoricoEstoque {
    private Long id;
    private Integer quantidade;
    private String Produto;
    private String Usuario;
    private String estado;
    private String observacao;
    private LocalDateTime dataHoraCriacao;
}