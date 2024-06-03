package com.mycompany.sistemadefacturacao20211958.models.repositorio;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ICRUDRepo<T> {
    public boolean salvar(T t);
    public List<T> buscarTodos();
    //public List<T> encontrarTodos();
    public Optional<T> buscarTodosPeloID(Long id);
    //public Optional<T> encontrarPeloId(Long id);
    public boolean removerPeloID(Long id);
    //public boolean removerPeloId(Long id);
    
    
    
    public boolean salvarTodos(List<T> list);
    public boolean existePeloId(Long id);
    public List<T> encontrarPeloAtributoUsandoAND(Map<String, Object> map, boolean usarLIKE);
    public List<T> encontrarPeloAtributoUsandoOR(Map<String, Object> map, boolean usarLIKE);
    public boolean existePeloAtributoEValor(Map<String, Object> map);
    public Long totalDeArquivo();
}