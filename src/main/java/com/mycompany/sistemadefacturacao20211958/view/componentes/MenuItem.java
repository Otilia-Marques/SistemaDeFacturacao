package com.mycompany.sistemadefacturacao20211958.view.componentes;

import com.mycompany.sistemadefacturacao20211958.view.modelos.MenuModelo;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.awt.RenderingHints.KEY_ANTIALIASING;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;

public class MenuItem extends javax.swing.JPanel {
    
    private boolean selected;
    private boolean over;

    public MenuItem(MenuModelo menuModelo) {
        initComponents();
        setOpaque(false);
        switch(menuModelo.getTipoMenu()) {
            case MENU -> {
                labelMenuItemIcone.setIcon(menuModelo.toIcon());
                labelMenuItemNome.setText(menuModelo.getNome());
            }
            case TITULO -> {
                labelMenuItemIcone.setText(menuModelo.getNome());
                labelMenuItemIcone.setFont(new Font("Times New Roman", 1, 18));
                labelMenuItemIcone.setBackground(Color.WHITE);
                labelMenuItemNome.setVisible(false);
            }
            case VAZIO -> {
                labelMenuItemNome.setText("");
            }
        }
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    public void setOver(boolean over) {
        this.over = over;
        repaint();
    }    

    @Override
    protected void paintComponent(Graphics g) {
        if (selected || over) {
            Graphics2D graphics2D = (Graphics2D) g;
        
            graphics2D.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);
            
            if (selected) {
                graphics2D.setColor(new Color(255, 255, 255, 80));
            } else{
                graphics2D.setColor(new Color(255, 255, 255, 20));
            }
            
            graphics2D.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        super.paintComponent(g); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelMenuItemIcone = new javax.swing.JLabel();
        labelMenuItemNome = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        labelMenuItemNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labelMenuItemNome.setForeground(new java.awt.Color(255, 255, 255));
        labelMenuItemNome.setText("Menu Item");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelMenuItemIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMenuItemNome, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMenuItemNome, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(labelMenuItemIcone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelMenuItemIcone;
    private javax.swing.JLabel labelMenuItemNome;
    // End of variables declaration//GEN-END:variables
}