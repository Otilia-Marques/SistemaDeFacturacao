package com.mycompany.sistemadefacturacao20211958.view.modelos;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
    
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MenuModelo {
    private String icon;
    private String nome;
    private TipoMenu tipoMenu;
    
    public enum TipoMenu {
        MENU, TITULO, VAZIO;
    }
    
    public Icon toIcon() {
        String filename = System.getProperty("user.dir") + "\\src\\main\\java\\com\\mycompany\\sistemadefacturacao20211958\\view\\imagens\\" + icon + ".png";
        return new ImageIcon(filename);
    }
}