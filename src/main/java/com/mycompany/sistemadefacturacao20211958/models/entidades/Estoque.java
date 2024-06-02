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

public class Estoque {
    private Long id;
    private Long idProduto;
    private Integer quantidade;
    private Long idUsuario;
    private Boolean estado;
    private LocalDateTime dataHoraCriacao;
}