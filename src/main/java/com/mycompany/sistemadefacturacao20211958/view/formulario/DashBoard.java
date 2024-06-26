package com.mycompany.sistemadefacturacao20211958.view.formulario;

import com.dxc.gestao.venda.visao.formulario.Formulario;
import com.mycompany.sistemadefacturacao20211958.models.entidades.Usuario;
import com.mycompany.sistemadefacturacao20211958.view.componentes.Menu;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class DashBoard extends javax.swing.JFrame {

    private DashboardControlador dashboardControlador;
    private Formulario formulario;
    private FormularioProduto formularioProduto;
    private FormularioEstoque formularioEstoque;
    private FormularioCliente formularioCliente;
    private FormularioVenda formularioVenda;
    private FormularioPrincipal formularioPrincipal;
    private FormularioUsuario formularioUsuario;
    private Usuario usuario;
    private int menuSelectionadoIndex = 0;

    public Dashboard(Usuario usuario) {
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        inicializaFormulario(usuario.getId(), cabecalho1, this);
        menu2.addEventoMenuSelecionado(e -> {
            menuSelectionadoIndex = e;
            formularioUsuario.setMenuSelectionadoIndex(e);
            formularioCliente.setMenuSelectionadoIndex(e);
            formularioProduto.setMenuSelectionadoIndex(e);
            formularioEstoque.setMenuSelectionadoIndex(e);
            formularioVenda.setMenuSelectionadoIndex(e);
            formularioPrincipal.setMenuSelectionadoIndex(e);
            System.out.println(e);
            switch (e) {
                case 0 -> { setForm(formularioPrincipal); }
                case 1 -> { setForm(formularioProduto); }
                case 2 -> { setForm(formularioEstoque); }
                case 3 -> { setForm(formularioCliente); }
                case 4 -> { setForm(formularioVenda); }
                case 5 -> { setForm(formularioUsuario); }
                case 11 -> { fecharTela();}
            }
        });
        
        setForm(formularioPrincipal);
        if (usuario == null) 
            throw new RuntimeException("Usuario deve estar logado");
        
        this.usuario = usuario;
        menu2.inicializar(usuario);
        dashboardControlador = new DashboardControlador(this);
    }

    private void fecharTela() {
        int opcao = JOptionPane.showConfirmDialog(null, "Tens certeza?", "Sair", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void inicializaFormulario(Long usuarioId, Cabecalho cabecalho, Dashboard dashboard) {
        System.out.println("DASHBOARD: " + usuarioId);
        formularioPrincipal = new FormularioPrincipal(usuarioId, cabecalho);
        formularioProduto = new FormularioProduto(usuarioId, cabecalho, dashboard);
        formularioEstoque = new FormularioEstoque(usuarioId, cabecalho, formularioPrincipal);
        formularioCliente = new FormularioCliente(usuarioId, cabecalho);
        formularioVenda = new FormularioVenda(usuarioId, cabecalho, formularioPrincipal, formularioEstoque);
        formularioUsuario = new FormularioUsuario(usuarioId, cabecalho);
        
        formulario = new Formulario(formularioProduto);
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setForm(JComponent component) {
        panelPrincipal.removeAll();
        panelPrincipal.add(component);
        panelPrincipal.repaint();
        panelPrincipal.revalidate();
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Menu getMenu() {
        return menu2;
    }

    public FormularioUsuario getFormularioUsuario() {
        return formularioUsuario;
    }

    public Cabecalho getCabecalho() {
        return cabecalho1;
    }

    public int getMenuSelectionadoIndex() {
        return menuSelectionadoIndex;
    }

    public FormularioPrincipal getFormularioPrincipal() {
        return formularioPrincipal;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBoard1 = new com.mycompany.sistemadefacturacao20211958.view.componentes.PanelBoard();
        menu2 = new com.mycompany.sistemadefacturacao20211958.view.componentes.Menu();
        cabecalho1 = new com.mycompany.sistemadefacturacao20211958.view.componentes.Cabecalho();
        panelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelPrincipal.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBoard1Layout = new javax.swing.GroupLayout(panelBoard1);
        panelBoard1.setLayout(panelBoard1Layout);
        panelBoard1Layout.setHorizontalGroup(
            panelBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoard1Layout.createSequentialGroup()
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cabecalho1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                    .addGroup(panelBoard1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelBoard1Layout.setVerticalGroup(
            panelBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu2, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
            .addGroup(panelBoard1Layout.createSequentialGroup()
                .addComponent(cabecalho1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBoard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBoard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.sistemadefacturacao20211958.view.componentes.Cabecalho cabecalho1;
    private com.mycompany.sistemadefacturacao20211958.view.componentes.Menu menu2;
    private com.mycompany.sistemadefacturacao20211958.view.componentes.PanelBoard panelBoard1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}