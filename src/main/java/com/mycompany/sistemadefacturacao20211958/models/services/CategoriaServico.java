/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefacturacao20211958.models.services;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CategoriaServico {
 
    private CrudRepositorio categoriaRepositorio;

    public CategoriaServico() {
        categoriaRepositorio = new CrudRepositorioImpl(Categoria.class) {};
    }
    
    public List<Categoria> encontrarTodos() {
        return categoriaRepositorio.encontrarTodos();
    }
    
    public String salva(Categoria categoria) {
        Map<String, Object> map = new HashMap<>();
        map.put("nome", categoria.getNome());
        if (categoria.getId() == null && categoriaRepositorio.existePeloAtributoEValor(map)) {
            return "Ja existe essa categoria cadastrado";
//            throw new RuntimeException(mensagem);
        }
        
        try {
            boolean result = categoriaRepositorio.salvar(categoria);
            
            if (result) {
                return "Categoria salvando com sucesso!";
            }
        } catch (Exception e) {
            System.out.println(e);
            return e.getMessage();
//            throw new RuntimeException(e);
        }
        return "Erro ao salvar categoria";
    }
    
    public Categoria encontrarPeloId(Long id) {
        Optional<Categoria> optionalCategoria = categoriaRepositorio.encontrarPeloId(id);
        
        if (optionalCategoria.isPresent()) {
            return optionalCategoria.get();
        }
        throw new RuntimeException("Categoria nao encontrado.");
    }
    
    public Categoria encontrarPeloNome(String nome) {
        Map<String, Object> map = new HashMap<>();
        map.put("nome", nome);
        
        List<Categoria> categorias = categoriaRepositorio.encontrarPeloAtributoUsandoAND(map, false);
        
        if (!categorias.isEmpty()) 
            return categorias.get(0);
        
        return null;
    }
    
    public String removerPeloId(Long id) {
        try {
            boolean resultado = categoriaRepositorio.removerPeloId(id);
            
            if (resultado) {
                return "Categoria removido com sucesso!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (e.getMessage().contains("a foreign key")) {
                return "Categoria esta em uso";
            }
            return e.getMessage();
        }
        return "Erro ao remover a categoria";
    }
}
