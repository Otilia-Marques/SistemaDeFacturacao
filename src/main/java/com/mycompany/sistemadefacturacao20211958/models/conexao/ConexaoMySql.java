package com.mycompany.sistemadefacturacao20211958.models.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySql {
    
    private static final String USUARIO = "root";
    private static final String SENHA = "Tini Stoessel";
    private static final String URL = "jdbc:mysql://localhost:3306/SistemaDeFacturação";
    private static Connection connection;
    
    public ConexaoMySql(){
        
    }
    
    public static Connection obterConnection () throws SQLException{
        if (connection == null) {
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);
        }
        return connection;
    }
    
    public static void fecharConnection() throws SQLException{
        if (connection != null) {
            connection.close();
        }
    }
    
    /*
    public static void main(String[] args) throws SQLException {
        System.out.println(obterConnection());
    }*/
}