package com.mycompany.sistemadefacturacao20211958.models.repositorio;

import com.mycompany.sistemadefacturacao20211958.models.conexao.ConexaoMySql;
import com.mycompany.sistemadefacturacao20211958.models.util.SQLFormato;
import com.mycompany.sistemadefacturacao20211958.models.util.SQLInserts;
import com.mycompany.sistemadefacturacao20211958.models.util.SQLUpdate;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.reflections.ReflectionUtils;

public abstract class CRUD<T> implements ICRUDRepo<T>{

    private Class<T> t;

    public CRUD(Class<T> t) {
        this.t = t;
    }
    
    @Override
    public boolean salvar(T t) {
        Object id= null;
        Set<Field> campos = ReflectionUtils.getFields(this.t, e -> true);
        
        try {
            for (Field campo : campos) {
                campo.setAccessible(true);
                
                if (campo.getName().equalsIgnoreCase("id")) {
                    id = campo.get(t);
                }
            }
       
            if (id == null) {
                SQLFormato sql = new SQLInserts(this.t);
                return persistencia(sql.formato(), t, false);
            }
            
            SQLFormato sql = new SQLUpdate(this.t);
            return persistencia(sql.formato(), t, true);
            
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }   

    @Override
    public List<T> buscarTodos() {
        List<T> lista = new ArrayList<>();
        try {
            String SQL = String.format("SELECT * FROM %s", t.getSimpleName());
            
            ResultSet resultSet = ConexaoMySql.obterConnection().prepareStatement(SQL).executeQuery();

            while (resultSet.next()) {
                lista.add(getT(resultSet));
            }
            
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return lista;
    }

    @Override
    public Optional<T> buscarTodosPeloID(Long id) {
        try {
            String SQL = String.format("SELECT * FROM %s WHERE id = ?", t.getSimpleName());
            PreparedStatement ps = ConexaoMySql.obterConnection().prepareStatement(SQL);
            
            ps.setLong(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return Optional.ofNullable(getT(rs));
            }
                       
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        
        return Optional.empty();
    }

    @Override
    public boolean removerPeloID(Long id) {
        try {
            String SQL = String.format("DELETE FROM %s WHERE id = ?", t.getSimpleName());
            
            PreparedStatement ps = ConexaoMySql.obterConnection().prepareStatement(SQL);
            
            ps.setLong(1, id);
            
            int resultado = ps.executeUpdate();
            
            return resultado ==1;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
    public T getT(ResultSet resultSet){
        try {
            T novoT = t.newInstance();
            Method method = null;
            
            Set<Field> campos = ReflectionUtils.getAllFields(t, e -> true);
            
            for (Field campo : campos) {
                Object valor = null;
                String nome = campo.getName();
                
                switch(campo.getType().getSimpleName().toUpperCase()){
                    case "STRING":
                        valor = resultSet.getString(nome);
                        method = t.getMethod("set" + primeiraLetraMaiuscula(nome), String.class);
                    break;
                    case "LONG":
                        valor = resultSet.getLong(nome);
                        method = t.getMethod("set" + primeiraLetraMaiuscula(nome), Long.class);
                    break;
                    case "BOOLEAN":
                        valor = resultSet.getBoolean(nome);
                        method = t.getMethod("set" + primeiraLetraMaiuscula(nome), Boolean.class);
                    break;
                    case "INTEGER":
                        valor = resultSet.getInt(nome);
                        method = t.getMethod("set" + primeiraLetraMaiuscula(nome), Integer.class);
                    break;
                    case "Object":
                        valor = resultSet.getObject(nome);
                        method = t.getMethod("set" + primeiraLetraMaiuscula(nome), Object.class);
                    break;
                    case "LOCALDATETIME":
                        valor = resultSet.getObject(nome, LocalDateTime.class);
                        method = t.getMethod("set" + primeiraLetraMaiuscula(nome), LocalDateTime.class);
                    break;
                    case "BIGDECIMAL":
                        valor = resultSet.getBigDecimal(nome);
                        method = t.getMethod("set" + primeiraLetraMaiuscula(nome), BigDecimal.class);
                    break;
                }
                
                method.invoke(novoT, valor);
            }
            return novoT;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
    private  String primeiraLetraMaiuscula(String texto){
        if (!texto.isBlank()) {
            return texto.substring(0,1).toUpperCase().concat(texto.substring(1));
        }
        
        return "";
    }

    private boolean persistencia(String sql, Object t, boolean actualizar) {
        try {
            PreparedStatement ps = ConexaoMySql.obterConnection().prepareStatement(sql);
            
            preencherPS(t, ps, actualizar);
            
            int resultado = ps.executeUpdate();
                    
            return (resultado == 1);
           
        }catch(Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
    private void preencherPS(Object t, PreparedStatement ps, boolean actualizar){
        int contador = 1;
        Set<Field> campos = ReflectionUtils.getFields(this.t, e -> true);
        
        try {
            for (Field campo : campos) {
                campo.setAccessible(true);
                
                if (actualizar && campo.getName().equalsIgnoreCase("id")) {
                    ps.setObject(campos.size(), campo.get(t));
                    continue;
                }
                
                ps.setObject(contador, campo.get(t));
                contador++;
            }
        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}