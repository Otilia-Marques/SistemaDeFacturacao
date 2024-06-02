package com.mycompany.sistemadefacturacao20211958.view.modelos;

import javax.swing.Icon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CartaoModelo {
    private Icon icon;
    private String titulo;
    private String valor;
    
}