package com.mycompany.sistemadefacturacao20211958.models.repositorio;

import java.util.List;
import java.util.Optional;

public interface ICRUDRepo<T> {
    public boolean salvar(T t);
    public List<T> buscarTodos();
    public Optional<T> buscarTodosPeloID(Long id);
    public boolean removerPeloID(Long id);
}