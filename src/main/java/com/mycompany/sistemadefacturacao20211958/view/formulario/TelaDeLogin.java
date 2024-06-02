package com.mycompany.sistemadefacturacao20211958.view.formulario;

import com.mycompany.sistemadefacturacao20211958.controller.LoginController;
import com.mycompany.sistemadefacturacao20211958.view.componentes.CampoDeBotão;
import com.mycompany.sistemadefacturacao20211958.view.componentes.CampoDeSenha;
import com.mycompany.sistemadefacturacao20211958.view.componentes.CampoDeTexto;
import com.mycompany.sistemadefacturacao20211958.view.componentes.PanelCarregar;
import com.mycompany.sistemadefacturacao20211958.view.util.MensagemUtil;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.miginfocom.swing.MigLayout;

public class TelaDeLogin extends javax.swing.JFrame {
    
    private MigLayout layout;
    private PanelCarregar panelCarregar;
    private MensagemUtil mensagemUtil;
    private LoginController loginController;
    
    private int x;
    private int y;
    
    public TelaDeLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        loginController = new LoginController(this);
        
        layout = new MigLayout("fill, insets");
        panelCarregar = new PanelCarregar();
        
        BackGround.setLayout(layout);
        BackGround.add(panelCarregar, "pos 0 0 100% 100%");
        BackGround.add(panelMovimento, "pos 0 0 100% 100%");
        
        mensagemUtil = new MensagemUtil(BackGround, layout);
        evento();
        moveTelaLogin(this);
        fechaTelaLogin();
    }
    
    private void moveTelaLogin(JFrame frame){
        panelMovimento.addMouseListener(new MouseAdapter() {
           @Override
           public void mousePressed(MouseEvent e){
               x = getX();
               y = getY();
           }
        });
        
        panelMovimento.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseDragged(MouseEvent e){
               frame.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
           }
        });
    }
    
    private void fechaTelaLogin(){
        labelFechar.addMouseListener(new MouseAdapter() {
           @Override
           public void mousePressed(MouseEvent e){
               int opcao = JOptionPane.showConfirmDialog(null, "Tens Certeza que queres Sair?", 
               "Sair", JOptionPane.YES_NO_OPTION);
               
               if(opcao == JOptionPane.YES_OPTION)
                   System.exit(0);
           }
        });
           
        labelFechar.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseEntered(MouseEvent e){
               labelFechar.setBackground(Color.RED); 
               labelFechar.setForeground(Color.WHITE);
               labelFechar.setOpaque(true);
           }
           
           @Override
           public void mouseExited(MouseEvent e){
               labelFechar.setForeground(Color.WHITE);
               labelFechar.setOpaque(false);
           }
        });
    }

    private void evento(){
        campoDeBotãoLogin.addActionListener(loginController);
    }
    
    public MensagemUtil getMensagemUtil() {
        return mensagemUtil;
    }

    public void setMensagemUtil(MensagemUtil mensagemUtil) {
        this.mensagemUtil = mensagemUtil;
    }

    public PanelCarregar getPanelCarregar() {
        return panelCarregar;
    }

    public void setPanelCarregar(PanelCarregar panelCarregar) {
        this.panelCarregar = panelCarregar;
    }

    public CampoDeBotão getCampoDeBotãoLogin() {
        return campoDeBotãoLogin;
    }

    public void setCampoDeBotãoLogin(CampoDeBotão campoDeBotãoLogin) {
        this.campoDeBotãoLogin = campoDeBotãoLogin;
    }

    public CampoDeSenha getCampoDeSenha() {
        return campoDeSenha;
    }

    public void setCampoDeSenha(CampoDeSenha campoDeSenha) {
        this.campoDeSenha = campoDeSenha;
    }

    public CampoDeTexto getCampoDeTextoUsuario() {
        return campoDeTextoUsuario;
    }

    public void setCampoDeTextoUsuario(CampoDeTexto campoDeTextoUsuario) {
        this.campoDeTextoUsuario = campoDeTextoUsuario;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMovimento = new com.mycompany.sistemadefacturacao20211958.view.componentes.PanelBoard();
        jPanel1 = new javax.swing.JPanel();
        labelFechar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoDeTextoUsuario = new com.mycompany.sistemadefacturacao20211958.view.componentes.CampoDeTexto();
        campoDeSenha = new com.mycompany.sistemadefacturacao20211958.view.componentes.CampoDeSenha();
        jSeparator1 = new javax.swing.JSeparator();
        campoDeBotãoLogin = new com.mycompany.sistemadefacturacao20211958.view.componentes.CampoDeBotão();
        BackGround = new javax.swing.JLayeredPane();

        panelMovimento.setCor1(new java.awt.Color(255, 255, 255));
        panelMovimento.setCor2(new java.awt.Color(255, 0, 153));

        jPanel1.setOpaque(false);

        labelFechar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        labelFechar.setForeground(new java.awt.Color(255, 255, 255));
        labelFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFechar.setText("X");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bebesuki'Store");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addComponent(labelFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        campoDeTextoUsuario.setForeground(new java.awt.Color(255, 0, 153));
        campoDeTextoUsuario.setCor(new java.awt.Color(255, 255, 255));
        campoDeTextoUsuario.setDicas("Usuário");
        campoDeTextoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        campoDeTextoUsuario.setPrefIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\SistemaDeFacturacao20211958\\src\\main\\java\\com\\mycompany\\sistemadefacturacao20211958\\view\\imagens\\mail.png")); // NOI18N

        campoDeSenha.setForeground(new java.awt.Color(255, 0, 153));
        campoDeSenha.setCor(new java.awt.Color(255, 255, 255));
        campoDeSenha.setDicas("Senha");
        campoDeSenha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        campoDeSenha.setPrefIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\SistemaDeFacturacao20211958\\src\\main\\java\\com\\mycompany\\sistemadefacturacao20211958\\view\\imagens\\pass.png")); // NOI18N

        campoDeBotãoLogin.setBackground(new java.awt.Color(255, 0, 153));
        campoDeBotãoLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        campoDeBotãoLogin.setForeground(new java.awt.Color(255, 255, 255));
        campoDeBotãoLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\SistemaDeFacturacao20211958\\src\\main\\java\\com\\mycompany\\sistemadefacturacao20211958\\view\\imagens\\login_16.png")); // NOI18N
        campoDeBotãoLogin.setText("LOGIN");
        campoDeBotãoLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        campoDeBotãoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeBotãoLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMovimentoLayout = new javax.swing.GroupLayout(panelMovimento);
        panelMovimento.setLayout(panelMovimentoLayout);
        panelMovimentoLayout.setHorizontalGroup(
            panelMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(panelMovimentoLayout.createSequentialGroup()
                .addGroup(panelMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMovimentoLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(panelMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoDeTextoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                            .addComponent(campoDeSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelMovimentoLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(campoDeBotãoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMovimentoLayout.setVerticalGroup(
            panelMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovimentoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(campoDeTextoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(campoDeBotãoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 93, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDeBotãoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeBotãoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeBotãoLoginActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane BackGround;
    private com.mycompany.sistemadefacturacao20211958.view.componentes.CampoDeBotão campoDeBotãoLogin;
    private com.mycompany.sistemadefacturacao20211958.view.componentes.CampoDeSenha campoDeSenha;
    private com.mycompany.sistemadefacturacao20211958.view.componentes.CampoDeTexto campoDeTextoUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelFechar;
    private com.mycompany.sistemadefacturacao20211958.view.componentes.PanelBoard panelMovimento;
    // End of variables declaration//GEN-END:variables
}