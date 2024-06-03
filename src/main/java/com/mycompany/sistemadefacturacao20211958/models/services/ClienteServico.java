/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefacturacao20211958.models.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteServico {
    
    private final CrudRepositorio clienteRepositorio;
    

    public ClienteServico() {
        clienteRepositorio = new CrudRepositorioImpl(Cliente.class) {};
    }
    
    public List<Cliente> encontrarTodos() {
       return clienteRepositorio.encontrarTodos();
    }

    public String salvar(Cliente cliente) {
        try {
            boolean resultado = clienteRepositorio.salvar(cliente);
            
            if (resultado)
                return "Cliente salvo com sucesso!";
        } catch (Exception e) {
            return e.getMessage();
        }
        
        return "Erro ao salvar cliente";
    }

    public String remover(Long id) {
        try {
            boolean resultado = clienteRepositorio.removerPeloId(id);
            
            if (resultado) 
                return "Cliente removindo com sucesso!";
        } catch (Exception e) {
            return e.getMessage();
        }
        
        return "Erro ao remover cliente";
    }
    
    public Cliente encontrarClientePeloAtributoCPF(String texto) {
        Map<String, Object> map = new HashMap<>();
        map.put("cpf", texto);
        
        List<Cliente> cliente = clienteRepositorio.encontrarPeloAtributoUsandoAND(map, false);
        
        if (cliente.size() != 1) {
            return null;
        }
        
        return cliente.get(0);
    }
        
    
    public List<Cliente> encontrarClientePeloAtributo(String texto) {
        Map<String, Object> map = new HashMap<>();
        map.put("nome", texto);
        map.put("cpf", texto);
        map.put("morada", texto);
        
        return clienteRepositorio.encontrarPeloAtributoUsandoOR(map, true);
    }
    
}
