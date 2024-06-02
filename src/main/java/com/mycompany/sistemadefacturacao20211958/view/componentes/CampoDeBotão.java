package com.mycompany.sistemadefacturacao20211958.view.componentes;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class CampoDeBotão extends JButton{
    private Animator animacao;
    private float tempoAnimacao;
    private Point ponto;
    private float alfa;
    private int tamanhoAlvo;
    private Color corDoEfeito = new Color(255, 255, 255);
    
    public CampoDeBotão(){
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(5, 0, 5, 0));
        setBackground(Color.WHITE);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                tamanhoAlvo = Math.max(getWidth(), getHeight() * 2);
                tempoAnimacao = 0;
                ponto = e.getPoint();
                alfa = 0.5f;
                
                if(animacao.isRunning()){
                    animacao.stop();
                }
                
                animacao.start();
            }
        });
        
        TimingTarget target = new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction) {
                if (fraction > 0.5f) {
                    alfa = 1 - fraction;
                }
                
                tempoAnimacao = fraction * tamanhoAlvo;
                repaint();
            }
        };
        
        animacao = new Animator(700, target);
        animacao.setAcceleration(0.5f);
        animacao.setDeceleration(0.5f);
        animacao.setResolution(0);        
    }   

    @Override
    protected void paintComponent(Graphics g) {
        
        int comprimento = getWidth();
        int altura = getHeight();
        
        BufferedImage img = new BufferedImage(comprimento, altura, BufferedImage.TYPE_INT_ARGB);
        
        Graphics2D g2D = img.createGraphics();
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.setColor(getBackground());
        g2D.fillRoundRect(0, 0, comprimento, altura, altura, altura);
        
        if (ponto != null) {
            g2D.setColor(corDoEfeito);
            g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alfa));
            g2D.fillOval((int) (ponto.x - tempoAnimacao / 2), (int) (ponto.y - tempoAnimacao / 2),
                (int) tempoAnimacao, (int) tempoAnimacao);
        }
        
        g2D.dispose();
        g.drawImage(img, 0, 0, null);
        
        super.paintComponent(g);
    }
}