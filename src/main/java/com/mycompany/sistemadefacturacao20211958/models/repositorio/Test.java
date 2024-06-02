package com.mycompany.sistemadefacturacao20211958.models.repositorio;

import com.mycompany.sistemadefacturacao20211958.models.entidades.Categoria;

public class Test extends CRUD{

    public Test() {
        super(Categoria.class);
    }
    
    public static void main(String[] args) {
        Categoria c = Categoria.builder()
        .id(1L)
        .nome("Bebidas")
        .descricao("Produtos para Beber")
        .build();
        
        Test r = new Test();
        
        //System.out.println("RESULTADO" + r.salvar(c));
        //System.out.println("RESULTADO" + r.buscarTodos());
        //System.out.println("RESULTADO" + r.buscarTodosPeloID(2L));
        System.out.println("RESULTADO" + r.removerPeloID(5L));
    }
}