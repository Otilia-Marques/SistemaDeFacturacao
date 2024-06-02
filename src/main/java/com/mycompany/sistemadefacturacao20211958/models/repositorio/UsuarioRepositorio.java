package com.mycompany.sistemadefacturacao20211958.models.repositorio;

import com.mycompany.sistemadefacturacao20211958.models.conexao.ConexaoMySql;
import com.mycompany.sistemadefacturacao20211958.models.entidades.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UsuarioRepositorio extends CRUD{

    public UsuarioRepositorio() {
        super(Usuario.class);
    }
    
    public Optional<Object> buscarPeloUsuario(String usuario){
        try {
           String SQL = "SELECT * FROM usuario WHERE usuario = ?";
           
            PreparedStatement ps = ConexaoMySql.obterConnection().prepareStatement(SQL);
            ps.setString(1, usuario);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return Optional.ofNullable(getT(rs));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return Optional.empty();
    }
    
    
    public static void main(String[] args) {
        Usuario usuario = Usuario.builder()
                .nome("Otilia Marques")
                .usuario("Elidania Marques")
                .senha(new BCryptPasswordEncoder().encode("Tini"))
                .estado(true)
                .perfil("Admin")
                .dataHoraCriacao(LocalDateTime.now())
                .build();
        
        UsuarioRepositorio repositorio = new UsuarioRepositorio();
        
        repositorio.salvar(usuario);
    }
}