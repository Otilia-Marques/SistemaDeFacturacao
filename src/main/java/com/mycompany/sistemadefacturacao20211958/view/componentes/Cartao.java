package com.mycompany.sistemadefacturacao20211958.view.componentes;

import com.mycompany.sistemadefacturacao20211958.view.modelos.CartaoModelo;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.awt.RenderingHints.KEY_ANTIALIASING;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;
import javax.swing.JLabel;

public class Cartao extends javax.swing.JPanel {

    private Color color1;
    private Color color2;
 
    public Cartao() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
    }
    
    public void setData(CartaoModelo cartaoModelo) {
        labelCartaoIcon.setIcon(cartaoModelo.getIcon());
        labelCartaoTitulo.setText(cartaoModelo.getTitulo());
        labelCartaoValor.setText(cartaoModelo.getValor());
    }

    public JLabel getLabelCartaoValor() {
        return labelCartaoValor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        
        graphics2D.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);
        GradientPaint gradientPaint = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        
        graphics2D.setColor(new Color(255, 255, 255, 50));
        graphics2D.fillOval(getWidth() - (getHeight() /2), 10, getHeight(), getHeight());
        graphics2D.fillOval(getWidth() - (getHeight() /2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        
        super.paintComponent(g); 
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCartaoIcon = new javax.swing.JLabel();
        labelCartaoTitulo = new javax.swing.JLabel();
        labelCartaoValor = new javax.swing.JLabel();

        labelCartaoIcon.setText("jLabel1");

        labelCartaoTitulo.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        labelCartaoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelCartaoTitulo.setText("Titulo");

        labelCartaoValor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelCartaoValor.setForeground(new java.awt.Color(255, 255, 255));
        labelCartaoValor.setText("Valor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCartaoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCartaoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCartaoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCartaoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCartaoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(labelCartaoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelCartaoIcon;
    private javax.swing.JLabel labelCartaoTitulo;
    private javax.swing.JLabel labelCartaoValor;
    // End of variables declaration//GEN-END:variables
}