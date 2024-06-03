package com.mycompany.sistemadefacturacao20211958.controller;

import com.mycompany.sistemadefacturacao20211958.models.entidades.Usuario;

public class DashboardControlador {
    
    private static Dashboard dashboard;
    private final FormularioUsuarioControlador formularioUsuarioControlador;

    public DashboardControlador(Dashboard dashboard) {
        DashboardControlador.dashboard = dashboard;
        formularioUsuarioControlador = new FormularioUsuarioControlador(dashboard.getFormularioUsuario());
    }

    public Dashboard getDashboard() {
        return dashboard;
    }
    
    public static void inicializarMenu(Usuario usuario) {
        dashboard.getMenu().inicializar(usuario);
    }

//    @Override
//    public void keyTyped(KeyEvent e) {}
//
//    @Override
//    public void keyPressed(KeyEvent e) {}
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//        System.out.println("MENU: " + dashboard.getMenuSelectionadoIndex());
//        System.out.println("Type... " + dashboard.getCabecalho().getPesquisar().getText());
//        
//        pesquisa(dashboard.getMenuSelectionadoIndex());
//    }
//    
//    public void pesquisa(int menuIndex) {
//        switch(menuIndex) {
//            case 0 -> {dashboard();}
//            case 1 -> {}
//            case 2 -> {}
//            case 3 -> {}
//            case 4 -> {}
//            case 5 -> {usuario();}
//        }
//    }
//    
//    private void dashboard() {
//    }
//    
//    private void usuario() {
//        formularioUsuarioControlador.pesquisa(dashboard.getCabecalho().getPesquisar().getText());
//    }
}