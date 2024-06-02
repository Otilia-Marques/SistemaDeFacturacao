package com.mycompany.sistemadefacturacao20211958.models.services;

import com.mycompany.sistemadefacturacao20211958.models.entidades.Usuario;
import com.mycompany.sistemadefacturacao20211958.models.repositorio.UsuarioRepositorio;
import java.util.Optional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UsuarioServico {
    private UsuarioRepositorio ur;

    public UsuarioServico() {
        ur = new UsuarioRepositorio();
    }
    
    public String login(String usuario, String Senha){
        Optional uOptional = ur.buscarPeloUsuario(usuario);
        
        if (uOptional.isPresent()) {
            Usuario user = (Usuario) uOptional.get();
            
            if (verificaPassword(Senha, user.getSenha())) {
                if (!user.getEstado()){
                    return "Ops! Usuário Bloqueado. Valida com o Admin...";
                }
                
                return "Usuário e Senha Correcta!";
            }   
            return "Ops! Usuario ou Senha incorrecta...";
        }
        
        return "Ops! Usuário Inexistente...";
    }
    
    public boolean verificaPassword(String senhaInserida, String senhaUsuario){
        return new BCryptPasswordEncoder().matches(senhaInserida, senhaUsuario);
    }
}