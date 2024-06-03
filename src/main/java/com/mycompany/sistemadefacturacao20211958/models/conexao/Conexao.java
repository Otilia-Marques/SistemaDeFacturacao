package com.mycompany.sistemadefacturacao20211958.models.conexao;

import java.sql.Connection;
import java.sql.SQLException;

public interface Conexao {
    
    public Connection obterConexao() throws SQLException;
    public void fechaConexao() throws SQLException;
}