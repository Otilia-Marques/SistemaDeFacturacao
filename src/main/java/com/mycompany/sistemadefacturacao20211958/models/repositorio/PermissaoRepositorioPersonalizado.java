package com.mycompany.sistemadefacturacao20211958.models.repositorio;

import com.mycompany.sistemadefacturacao20211958.models.conexao.Conexao;
import com.mycompany.sistemadefacturacao20211958.models.conexao.ConexaoMySql;
import java.sql.PreparedStatement;

public class PermissaoRepositorioPersonalizado {
    
    private Conexao conexao;
    
    public PermissaoRepositorioPersonalizado() {
        conexao = (Conexao) new ConexaoMySql();
    }
    
    public void delete(Long usuarioId, Long permissaoId) {
        System.out.println("DELEL: " + usuarioId + " " + permissaoId);
        String SQL = "DELETE FROM permissaousuario WHERE usuarioId = ? AND permissaoId = ?";
        
        try {
            PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(SQL);
            
            preparedStatement.setLong(1, usuarioId);
            preparedStatement.setLong(2, permissaoId);
            
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}