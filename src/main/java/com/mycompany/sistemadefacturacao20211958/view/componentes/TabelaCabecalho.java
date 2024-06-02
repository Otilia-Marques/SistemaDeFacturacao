package com.mycompany.sistemadefacturacao20211958.view.componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class TabelaCabecalho extends JLabel {

    public TabelaCabecalho(String texto) {
        super(texto);
        setOpaque(true);
        setBackground(Color.WHITE);
        setFont(new Font("Times New Roman", 1, 14));
        setForeground(new Color(102, 102, 102));
        setBorder(new EmptyBorder(10, 5, 10, 5));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(230, 230, 230));
        g.drawLine(0, getHeight() -1 , getWidth(), getHeight());
        super.paintComponent(g);        
    }   
}