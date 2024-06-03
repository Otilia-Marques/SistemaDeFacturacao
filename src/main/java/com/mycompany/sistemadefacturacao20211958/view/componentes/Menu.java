package com.mycompany.sistemadefacturacao20211958.view.componentes;

import com.mycompany.sistemadefacturacao20211958.view.modelos.MenuModelo;
import static com.mycompany.sistemadefacturacao20211958.view.modelos.MenuModelo.TipoMenu.MENU;
import static com.mycompany.sistemadefacturacao20211958.view.modelos.MenuModelo.TipoMenu.TITULO;
import static com.mycompany.sistemadefacturacao20211958.view.modelos.MenuModelo.TipoMenu.VAZIO;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.awt.RenderingHints.KEY_ANTIALIASING;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;
import java.io.File;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JPanel {
    
    private EventoMenuSelectionado evento;

    public Menu() {
        initComponents();
        setOpaque(false);
        jPanel1.setOpaque(false);
        listaMenu1.setOpaque(false);
        inicializarMenu();
    }
    /*
    public void inicializar(Usuario usuario) {
        labelNomeDoUsuario.setText(usuario.getNome());
        if(usuario.getUrlFoto() != null && !usuario.getUrlFoto().isBlank()) {
            try {
                File file = new File(usuario.getUrlFoto());
                if (file.isFile())  {
                    ImageIcon icon = new ImageIcon(file.getAbsolutePath());
                    imageAvatar1.setImage(icon);
                }
            } catch (Exception e) {
                System.out.println("Error ao carregar imagemdo usuario: " + e);
            }
        }
    }

    public JLabel getLabelNomeDoUsuario() {
        return labelNomeDoUsuario;
    }*/    
    
    private void inicializarMenu() {
        listaMenu1.adicionarItem(new MenuModelo("1", "Painel de Controlo", MENU));
        listaMenu1.adicionarItem(new MenuModelo("2", "Produto", MENU));
        listaMenu1.adicionarItem(new MenuModelo("3", "Estoque", MENU));
        listaMenu1.adicionarItem(new MenuModelo("4", "Cliente", MENU));
        listaMenu1.adicionarItem(new MenuModelo("5", "Venda", MENU));
        listaMenu1.adicionarItem(new MenuModelo("6", "Usuário", MENU));
        
        //listaMenu1.adicionarItem(new MenuModelo("", "", VAZIO));
        listaMenu1.adicionarItem(new MenuModelo("", "Suporte", TITULO));
        listaMenu1.adicionarItem(new MenuModelo("7", "Configuração", MENU));
        listaMenu1.adicionarItem(new MenuModelo("8", "Relatório", MENU));
        listaMenu1.adicionarItem(new MenuModelo("9", "Fala Conosco", MENU));
        listaMenu1.adicionarItem(new MenuModelo("10", "Sair", MENU));
        //listaMenu1.adicionarItem(new MenuModelo("", "", VAZIO));
    }
    
    public void addEventoMenuSelecionado(EventoMenuSelectionado evento) {
        this.evento = evento;
        listaMenu1.addEventoMenuSelecionado(evento);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        
        graphics2D.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);
        GradientPaint gradientPaint = new GradientPaint(0, 0, Color.decode("#FF99FF"), 0, getHeight(), Color.decode("#FF0099"));
        graphics2D.setPaint(gradientPaint);
        
        graphics2D.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        graphics2D.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintComponent(g); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        imagemAvatar1 = new com.mycompany.sistemadefacturacao20211958.view.componentes.ImagemAvatar();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        listaMenu1 = new com.mycompany.sistemadefacturacao20211958.view.componentes.ListaMenu<>();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bebesuki'Store");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        imagemAvatar1.setBorderSize(2);
        imagemAvatar1.setImage(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\SistemaDeFacturacao20211958\\src\\main\\java\\com\\mycompany\\sistemadefacturacao20211958\\view\\imagens\\Otilia_Code.JPG")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Otilia Marques");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(imagemAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator2)
            .addComponent(listaMenu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(imagemAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(listaMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.sistemadefacturacao20211958.view.componentes.ImagemAvatar imagemAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.mycompany.sistemadefacturacao20211958.view.componentes.ListaMenu<String> listaMenu1;
    // End of variables declaration//GEN-END:variables
}