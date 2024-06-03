package com.mycompany.sistemadefacturacao20211958.models.services;

import com.mycompany.sistemadefacturacao20211958.models.entidades.Usuario;
import com.mycompany.sistemadefacturacao20211958.models.repositorio.UsuarioRepositorio;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
    
public class UsuarioServico {
    private UsuarioRepositorio ur;
    private PermissaoServico permissaoServico;

    
    public UsuarioServico() {
        ur = new UsuarioRepositorio();
        permissaoServico = new PermissaoServico();    
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
    
    public List<Usuario> encontrarTodos() {
        return ur.buscarTodos();
    }
    
    public Usuario encontrarPeloId(Long id) {
        Optional<Usuario> usuario = ur.buscarPeloUsuario(id);
        
        return usuario.isPresent() ? usuario.get() : null;
    } 
    
       
    public String salvar(Usuario usuario) {
        Map<String, Object> map = new HashMap<>();
        map.put("usuario", usuario.getUsuario());
        if (usuario.getId() == null && ur.existePeloAtributoEValor(map)) {
            throw new RuntimeException("Ja existe usuario registrado com esse Nome de Usuario");
        }
        
        try {
            String hashSenha = new BCryptPasswordEncoder().encode(usuario.getSenha());
            usuario.setSenha(hashSenha);
           boolean result = ur.salvar(usuario);
           
           if (result) {
                if (usuario.getId() == null) {
                    List<Usuario> lista = ur.encontrarPeloAtributoUsandoAND(map, false);
                    if (!lista.isEmpty()) {
                        permissaoServico.salvarPermissaoDoUsuario(lista.get(0).getId(), Perfil.valueOf(usuario.getPerfil().toUpperCase()));
                    }
                }
                return "Usuario salvo com sucesso!!!";
            }
        } catch (Exception e) {
            List<Usuario> lista = ur.encontrarPeloAtributoUsandoAND(map, false);
            ur.removerPeloId(lista.get(0).getId());
            throw new RuntimeException("Erro ao salvar usuario " + e.getMessage());
        }
        return "Erro ao salvar usuario";
    }
    
    public boolean remover(Long id) {
        return ur.removerPeloId(id);
    }
    
    public List<Usuario> encontrarPeloAtributo(Map<String, Object> map) {
        return ur.encontrarPeloAtributoUsandoOR(map, true);
    }
}