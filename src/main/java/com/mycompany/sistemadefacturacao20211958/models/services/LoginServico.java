/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefacturacao20211958.models.services;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class LoginServico {

    private final CrudRepositorio usuarioRepositorio;
    
    public LoginServico() {
        usuarioRepositorio = new CrudRepositorioImpl(Usuario.class) {};
    }
    
    public LoginResponse login(String email, String senha) {
        Map<String, Object> map = new HashMap<>();
        map.put("email", email);
        List<Usuario> usuarios = usuarioRepositorio.encontrarPeloAtributoUsandoAND(map, false);
        
        if (!usuarios.isEmpty()) {
            Usuario usuario = usuarios.get(0);
           
            boolean resposta = usuario.getEstado() && 
                    new BCryptPasswordEncoder().matches(senha, usuario.getSenha());
            
            usuario.setUltimoLogin(LocalDateTime.now());
            usuarioRepositorio.salvar(usuario);
            return LoginResponse.builder()
                    .resposta(resposta)
                    .usuario(usuario)
                    .build();
        }
            
        return LoginResponse.builder()
                .resposta(false)
                .build();
    }
     
}
