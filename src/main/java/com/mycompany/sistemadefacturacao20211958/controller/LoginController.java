/*package com.mycompany.sistemadefacturacao20211958.controller;

import com.mycompany.sistemadefacturacao20211958.models.services.UsuarioServico;
import com.mycompany.sistemadefacturacao20211958.view.componentes.Mensagens;
import com.mycompany.sistemadefacturacao20211958.view.formulario.DashBoard;
import com.mycompany.sistemadefacturacao20211958.view.formulario.TelaDeLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener{
    private TelaDeLogin login;
    private UsuarioServico us;

    public LoginController(TelaDeLogin login) {
        this.login = login;
        us = new UsuarioServico();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String acao = e.getActionCommand().toLowerCase();
        
        switch (acao) {
            case "login":
                login();
            break;
            default:
                throw new AssertionError();
        }
    }

    private void login() {
        validarCampo();
        String usuario = login.getCampoDeTextoUsuario().getText();
        String senha = String.valueOf(login.getCampoDeSenha().getPassword());
        
        String mensagem = us.login(usuario, senha);
        
        if (mensagem.startsWith("Usuário e Senha")) {

            login.getMensagemUtil().mostarMensagem(Mensagens.TipoMensagem.SUCESSO, mensagem);
            login.getPanelCarregar().setVisible(true);
            
            new Thread(() -> {
                try {
                    Thread.sleep(2000);
                    limparCampos();
                    login.setVisible(false);
                    new DashBoard().setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }).start(); 
        }else{
            login.getMensagemUtil().mostarMensagem(Mensagens.TipoMensagem.ERRO, mensagem);
        }
    }
    
    private void validarCampo(){
        String usuario = login.getCampoDeTextoUsuario().getText();
        String senha = String.valueOf(login.getCampoDeSenha().getPassword());
        
        if (usuario.isBlank() || senha.isBlank()) {
            String smsErro = "Usuário e Senha são Obrigatório"; 
            login.getMensagemUtil().mostarMensagem(Mensagens.TipoMensagem.ERRO, smsErro);
            throw new RuntimeException(smsErro);
        }
    }
    
    private void limparCampos(){
        login.getCampoDeTextoUsuario().setText("");
        login.getCampoDeSenha().setText("");
    }
}*/


package com.mycompany.sistemadefacturacao20211958.controller;

import com.mycompany.sistemadefacturacao20211958.models.services.UsuarioServico;
import com.mycompany.sistemadefacturacao20211958.view.componentes.Mensagens;
import com.mycompany.sistemadefacturacao20211958.view.formulario.DashBoard;
import com.mycompany.sistemadefacturacao20211958.view.formulario.TelaDeLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener{
    private TelaDeLogin login;
    private UsuarioServico us;

    public LoginController(TelaDeLogin login) {
        this.login = login;
        us = new UsuarioServico();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String acao = e.getActionCommand().toLowerCase();
        
        switch (acao) {
            case "login":
                login();
                break;
            default:
                throw new AssertionError();
        }
    }

    private void login() {
        if (!validarCampo()) {
            return; // Se a validação falhar, sair do método
        }
        
        String usuario = login.getCampoDeTextoUsuario().getText();
        String senha = String.valueOf(login.getCampoDeSenha().getPassword());
        
        String mensagem = us.login(usuario, senha);
        
        if (mensagem.equals("Usuário e Senha Correcta!")) {

            login.getMensagemUtil().mostarMensagem(Mensagens.TipoMensagem.SUCESSO, mensagem);
            login.getPanelCarregar().setVisible(true);
            
            new Thread(() -> {
                try {
                    Thread.sleep(2000);
                    limparCampos();
                    login.setVisible(false);
                    new DashBoard().setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }).start(); 
        } else {
            login.getMensagemUtil().mostarMensagem(Mensagens.TipoMensagem.ERRO, mensagem);
        }
    }
    
    private boolean validarCampo(){
        String usuario = login.getCampoDeTextoUsuario().getText();
        String senha = String.valueOf(login.getCampoDeSenha().getPassword());
        
        if (usuario.isBlank() || senha.isBlank()) {
            String smsErro = "Usuário e Senha são Obrigatório"; 
            login.getMensagemUtil().mostarMensagem(Mensagens.TipoMensagem.ERRO, smsErro);
            return false;
        }
        return true;
    }
    
    private void limparCampos(){
        login.getCampoDeTextoUsuario().setText("");
        login.getCampoDeSenha().setText("");
    }
}
