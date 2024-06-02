package com.mycompany.sistemadefacturacao20211958.view.componentes;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Mensagens extends javax.swing.JPanel {

    private TipoMensagem tipoMensagem;
    private boolean mostra;
    
    public Mensagens() {
        initComponents();
        setVisible(false);
        setOpaque(false);
    }

    public enum TipoMensagem{
        SUCESSO, ERRO
    }
    
    public void mostrarMensagem(TipoMensagem tipo, String sms){
       this.tipoMensagem = tipo;
       LabelMensagem.setText(sms);
       
       String caminho = System.getProperty("user.dir") + "\\src\\main\\java\\com\\mycompany\\sistemadefacturacao20211958\\view\\imagens\\";
               
       if(tipo.equals(TipoMensagem.SUCESSO)){
           LabelMensagem.setIcon(new ImageIcon(caminho + "sucesso.png"));
       }else{
           LabelMensagem.setIcon(new ImageIcon(caminho + "erro.png"));
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        Graphics2D graphics2D = (Graphics2D) g;
            
        if (this.tipoMensagem == TipoMensagem.SUCESSO) {
            graphics2D.setColor(new Color(15, 174, 34));
        }else{
            graphics2D.setColor(new Color(240, 52, 53));
        }
        
        graphics2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.9f));
        
        graphics2D.fillRect(0, 0, getWidth(), getHeight());
        graphics2D.setComposite(AlphaComposite.SrcOver);
        graphics2D.setColor(new Color(245, 245, 245));
        graphics2D.drawRect(0, 0, getWidth() - 1, getHeight());
        super.paintComponent(g);
    }

    public TipoMensagem getTipoMensagem() {
        return tipoMensagem;
    }

    public void setTipoMensagem(TipoMensagem tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

    public boolean isMostra() {
        return mostra;
    }

    public void setMostra(boolean mostra) {
        this.mostra = mostra;
    }

    public JLabel getLabelMensagem() {
        return LabelMensagem;
    }

    public void setLabelMensagem(JLabel LabelMensagem) {
        this.LabelMensagem = LabelMensagem;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelMensagem = new javax.swing.JLabel();

        LabelMensagem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LabelMensagem.setForeground(new java.awt.Color(255, 255, 255));
        LabelMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMensagem.setText("Mensagem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMensagem;
    // End of variables declaration//GEN-END:variables
}