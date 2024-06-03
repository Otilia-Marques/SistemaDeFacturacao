package com.mycompany.sistemadefacturacao20211958.view.formulario;

import com.mycompany.sistemadefacturacao20211958.view.componentes.BarraDeRolar;
import com.mycompany.sistemadefacturacao20211958.view.componentes.Cabecalho;
import com.mycompany.sistemadefacturacao20211958.view.componentes.Cartao;
import com.mycompany.sistemadefacturacao20211958.view.componentes.Tabela;
import com.mycompany.sistemadefacturacao20211958.view.modelos.CartaoModelo;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FormularioPrincipal extends javax.swing.JPanel {

    private String totalProduto;
    private String totalEstoque;
    private String totalVenda;
    private FormularioPrincipalControlador controlador;
    private Long usuarioId;
    private Cabecalho cabecalho;
    private int menuSelectionadoIndex = 0;

    public FormularioPrincipal(Long usuarioId, Cabecalho cabecalho) {
        initComponents();
        setOpaque(false);
        System.out.println("FORMULARIO PRINCIPAL: " + usuarioId);
        
        jScrollPane2.getViewport().setBackground(Color.WHITE);
        jScrollPane2.setVerticalScrollBar(new BarraDeRolar());
        this.usuarioId = usuarioId;
        this.cabecalho = cabecalho;
        controlador = new FormularioPrincipalControlador(this);
        inicializarCartao();
        
        evento();
        eventoDoTeclado();
    }

    public int getMenuSelectionadoIndex() {
        return menuSelectionadoIndex;
    }

    public void setMenuSelectionadoIndex(int menuSelectionadoIndex) {
        this.menuSelectionadoIndex = menuSelectionadoIndex;
    }
    
    private void eventoDoTeclado() {
        cabecalho.getPesquisar().addKeyListener(controlador);
    }

    private void inicializarCartao() {
        cartao2.setData(new CartaoModelo(new ImageIcon(path() + "\\venda.png"), "Venda", totalVenda));
        cartao3.setData(new CartaoModelo(new ImageIcon(path() + "\\stock.png"), "Estoque", totalEstoque));
        cartao1.setData(new CartaoModelo(new ImageIcon(path() + "\\produto.png"), "Produto", totalProduto));
    }
    
    private void evento() {
        cartao1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                cartao1.setBackground(new Color(242,242,242));
                cartao1.setColor1(new Color(0,180,219));
            }
        });
        
        cartao1.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                cartao1.setColor1(new Color(255, 228, 122));
                cartao1.setBackground(Color.WHITE);
            }
        });
       
        cartao2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                cartao2.setBackground(new Color(242,242,242));
                cartao2.setColor1(new Color(48,43,99));
            }
        });
        
        cartao2.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                cartao2.setColor1(new Color(255, 228, 122));
                cartao2.setBackground(Color.WHITE);
            }
        });
        
        cartao3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                cartao3.setBackground(new Color(242,242,242));
                cartao3.setColor1(new Color(176,106,179));
            }
        });
        
        cartao3.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                cartao3.setColor1(new Color(255, 228, 122));
                cartao3.setBackground(Color.WHITE);
            }
        });
    }

    public Cabecalho getCabecalho() {
        return cabecalho;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }
    
    public void setTotalEstoque(String totalEstoque) {
        this.totalEstoque = totalEstoque;
    }

    public void setTotalProduto(String totalProduto) {
        this.totalProduto = totalProduto;
    }

    public void setTotalVenda(String totalVenda) {
        this.totalVenda = totalVenda;
    }
    
    private String path() {
        return System.getProperty("user.dir") + "\\src\\main\\java\\com\\dxc\\gestao\\venda\\visao\\icon";
    }

    public Cartao getCartao1() {
        return cartao1;
    }

    public void setCartao1(Cartao cartao1) {
        this.cartao1 = cartao1;
    }

    public Cartao getCartao2() {
        return cartao2;
    }

    public void setCartao2(Cartao cartao2) {
        this.cartao2 = cartao2;
    }

    public Cartao getCartao3() {
        return cartao3;
    }

    public void setCartao3(Cartao cartao3) {
        this.cartao3 = cartao3;
    }

    public Tabela getTabela() {
        return tabela;
    }

    public JLabel getLabelTitulo() {
        return labelTitulo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cartao6 = new com.mycompany.sistemadefacturacao20211958.view.componentes.Cartao();
        cartao4 = new com.mycompany.sistemadefacturacao20211958.view.componentes.Cartao();
        cartao5 = new com.mycompany.sistemadefacturacao20211958.view.componentes.Cartao();
        panelBoard1 = new com.mycompany.sistemadefacturacao20211958.view.componentes.PanelBoard();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela1 = new com.mycompany.sistemadefacturacao20211958.view.componentes.Tabela();

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        cartao6.setColor1(new java.awt.Color(255, 153, 255));
        cartao6.setColor2(new java.awt.Color(255, 0, 153));
        jPanel1.add(cartao6);

        cartao4.setColor1(new java.awt.Color(255, 102, 102));
        cartao4.setColor2(new java.awt.Color(0, 204, 0));
        jPanel1.add(cartao4);

        cartao5.setColor1(new java.awt.Color(204, 102, 255));
        cartao5.setColor2(new java.awt.Color(51, 51, 255));
        jPanel1.add(cartao5);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Histórico De Vendas");

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Quantitade", "Preço", "Estado", "Motivo", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabela1);

        javax.swing.GroupLayout panelBoard1Layout = new javax.swing.GroupLayout(panelBoard1);
        panelBoard1.setLayout(panelBoard1Layout);
        panelBoard1Layout.setHorizontalGroup(
            panelBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoard1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panelBoard1Layout.setVerticalGroup(
            panelBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoard1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBoard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelBoard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.sistemadefacturacao20211958.view.componentes.Cartao cartao4;
    private com.mycompany.sistemadefacturacao20211958.view.componentes.Cartao cartao5;
    private com.mycompany.sistemadefacturacao20211958.view.componentes.Cartao cartao6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.mycompany.sistemadefacturacao20211958.view.componentes.PanelBoard panelBoard1;
    private com.mycompany.sistemadefacturacao20211958.view.componentes.Tabela tabela1;
    // End of variables declaration//GEN-END:variables
}
