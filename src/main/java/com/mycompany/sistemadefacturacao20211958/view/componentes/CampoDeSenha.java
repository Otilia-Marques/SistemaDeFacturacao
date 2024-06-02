package com.mycompany.sistemadefacturacao20211958.view.componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class CampoDeSenha extends JPasswordField{
    private String dicas;
    private Icon prefIcon;
    private Color cor;

    public CampoDeSenha() {
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setBackground(new Color(0, 0, 0, 0));
        setForeground(Color.decode("#ec26ec"));
        setFont(new Font("Times New Roman", 0, 13));
        setSelectionColor(new Color(75, 175, 152));
        this.cor = new Color(255, 0, 153, 80);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;
        
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setColor(cor);
        graphics2D.fillRoundRect(0, 0, getWidth(), getHeight(), 5, 5);
        paintIcon(g);
        
        super.paintComponent(g);
    }

    @Override
    public void paint(Graphics g) {
        
        super.paint(g);
        
        if (getText().length() == 0) {
            int altura = getHeight();
            
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, 
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            
            Insets ins = getInsets();
            
            FontMetrics fm = g.getFontMetrics();
            g.setColor(new Color(200, 200, 200));
            g.drawString(dicas, ins.left, (altura / 2) + (fm.getAscent() / 2) -2);
        }
    }
    
    private void paintIcon(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;
        
        if(prefIcon != null){
            Image i = ((ImageIcon) prefIcon).getImage();
            
            int altura = (getHeight() - prefIcon.getIconHeight()) / 2;
            
            graphics2D.drawImage(i, 10, altura, this);  
        }
    }
    
    private void inicializarBorda(){
        int esquerda = 10;
        
        if (prefIcon != null) {
            esquerda = prefIcon.getIconWidth() + 15;
        }
        setBorder(BorderFactory.createEmptyBorder(10, esquerda, 10, 10)); 
    }

    public String getDicas() {
        return dicas;
    }

    public void setDicas(String dicas) {
        this.dicas = dicas;
    }

    public Icon getPrefIcon() {
        return prefIcon;
    }

    public void setPrefIcon(Icon prefIcon) {
        this.prefIcon = prefIcon;
        inicializarBorda();
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }
}