package com.mycompany.sistemadefacturacao20211958.models.util;

import java.lang.reflect.Field;
import java.util.Set;
import org.reflections.ReflectionUtils;

public class SQLInserts<T> implements SQLFormato{
    private Class<T> t;

    public SQLInserts(Class<T> t) {
        this.t = t;
    }
    
    @Override
    public String formato() {
        
        Set<Field> campos = ReflectionUtils.getFields(this.t, e -> true);
        StringBuilder atributos = new StringBuilder();
        StringBuilder pontos = new StringBuilder();
        
        try {
            for (Field campo : campos) {
                atributos.append(campo.getName()).append(",");
                pontos.append("?,");
            }   
            
            String atributo = removerUltimoCaracter(atributos.toString());
            String ponto = removerUltimoCaracter(pontos.toString());
            
            String SQL = String.format("INSERT INTO %s (%s) VALUES(%s)", t.getSimpleName(), atributo, ponto);
            
            return SQL;
            
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
    public String removerUltimoCaracter(String texto){
        if (!texto.isBlank()) {
            return texto.substring(0, texto.length()-1);
        }
        throw new RuntimeException("Texto vazio....");
    }
}