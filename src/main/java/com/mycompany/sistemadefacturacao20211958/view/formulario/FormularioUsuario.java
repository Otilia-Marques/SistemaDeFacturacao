package com.mycompany.sistemadefacturacao20211958.view.formulario;

import com.mycompany.sistemadefacturacao20211958.controller.FormularioUsuarioControlador;
import com.mycompany.sistemadefacturacao20211958.view.componentes.BarraDeRolar;
import com.mycompany.sistemadefacturacao20211958.view.componentes.Cabecalho;
import com.mycompany.sistemadefacturacao20211958.view.componentes.Tabela;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FormularioUsuario extends javax.swing.JPanel {
     
    private final FormularioUsuarioControlador formularioUsuarioControlador;
    private int menuSelectionadoIndex = -1;
    private Cabecalho cabecalho;
    private Long usuarioId;

    public FormularioUsuario(Long usuarioId, Cabecalho cabecalho) {
        initComponents();
        setOpaque(false);
        
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        jScrollPane1.setVerticalScrollBar(new BarraDeRolar());
        dialogPermissao.setBackground(Color.WHITE);
        dialogPermissao.setResizable(false);
        dialogUsuario.setResizable(false);
        textoFoto.setColumns(15);
        this.usuarioId = usuarioId;
        
        formularioUsuarioControlador = new FormularioUsuarioControlador(this);
        this.cabecalho = cabecalho;
        evento();
        eventoDoTeclado();
    }

    public Cabecalho getCabecalho() {
        return cabecalho;
    }

    public int getMenuSelectionadoIndex() {
        return menuSelectionadoIndex;
    }

    public void setMenuSelectionadoIndex(int menuSelectionadoIndex) {
        this.menuSelectionadoIndex = menuSelectionadoIndex;
    }
    
    public void eventoDoTeclado() {
        cabecalho.getPesquisar().addKeyListener(formularioUsuarioControlador);
    }

    private void evento() {
        botaoAdicionar.addActionListener(formularioUsuarioControlador);
        botaoAtualizar.addActionListener(formularioUsuarioControlador);
        botaoImprimir.addActionListener(formularioUsuarioControlador);
        botaoPermissao.addActionListener(formularioUsuarioControlador);
        botaoRemover.addActionListener(formularioUsuarioControlador);
        botaoSalvar.addActionListener(formularioUsuarioControlador);
        botaoFoto.addActionListener(formularioUsuarioControlador);
        botaoSalvaPermissao.addActionListener(formularioUsuarioControlador);
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Tabela getTabelaUsuario() {
        return tabelaUsuario;
    }

    public JButton getBotaoAdicionar() {
        return botaoAdicionar;
    }

    public JButton getBotaoAtualizar() {
        return botaoAtualizar;
    }

    public JButton getBotaoImprimir() {
        return botaoImprimir;
    }

    public JButton getBotaoPermissao() {
        return botaoPermissao;
    }

    public JButton getBotaoRemover() {
        return botaoRemover;
    }

    public JDialog getDialogUsuario() {
        return dialogUsuario;
    }

    public JTextField getTextoNome() {
        return textoNome;
    }

    public JTextField getTextoUsuario() {
        return textoUsuario;
    }

    public JPasswordField getTextoSenha() {
        return textoSenha;
    }

    public JComboBox<String> getComboboxPerfil() {
        return comboboxPerfil;
    }

    public JButton getBotaoSalvar() {
        return botaoSalvar;
    }

    public JLabel getLabelTitulo() {
        return labelTitulo;
    }

    public JLabel getLabelMensagem() {
        return labelMensagem;
    }

    public JRadioButton getRadioBotaoAtivo() {
        return radioBotaoAtivo;
    }

    public JRadioButton getRadioBotaoDesativo() {
        return radioBotaoDesativo;
    }

    public JDialog getDialogPermissao() {
        return dialogPermissao;
    }

    public JLabel getLabelUsuarioName() {
        return labelUsuarioName;
    }

    public JTextField getTextoFoto() {
        return textoFoto;
    }

    public JButton getBotaoFoto() {
        return botaoFoto;
    }

    public JCheckBox getCheckPermissaoUsuarioSalvar() {
        return checkPermissaoUsuarioSalvar;
    }

    public JCheckBox getCheckPermissaoUsuarioEncontrarSomenteDados() {
        return checkPermissaoUsuarioEncontrarSomenteDados;
    }

    public JCheckBox getCheckPermissaoUsuarioEncontrarTodos() {
        return checkPermissaoUsuarioEncontrarTodos;
    }

    public JCheckBox getCheckPermissaoUsuarioRemover() {
        return checkPermissaoUsuarioRemover;
    }

    public JCheckBox getCheckPermissaoCategoriaRemove() {
        return checkPermissaoCategoriaRemove;
    }

    public JCheckBox getCheckPermissaoCategoriaSalva() {
        return checkPermissaoCategoriaSalva;
    }

    public JCheckBox getCheckPermissaoVendaRemove() {
        return checkPermissaoVendaRemove;
    }

    public JCheckBox getCheckPermissaoSalva() {
        return checkPermissaoSalva;
    }
    
    public JCheckBox getCheckPermissaoClienteRemove() {
        return checkPermissaoClienteRemove;
    }

    public JCheckBox getCheckPermissaoEstoqueRemove() {
        return checkPermissaoEstoqueRemove;
    }

    public JCheckBox getCheckPermissaoEstoqueSalva() {
        return checkPermissaoEstoqueSalva;
    }

    public JCheckBox getCheckPermissaoProdutoRemove() {
        return checkPermissaoProdutoRemove;
    }

    public JCheckBox getCheckPermissaoProdutoSalva() {
        return checkPermissaoProdutoSalva;
    }

    public JCheckBox getCheckPermissaoRemove() {
        return checkPermissaoVendaRemove;
    }

    public JCheckBox getCheckPermissaoVendaAtualiza() {
        return checkPermissaoVendaAtualiza;
    }

    public JCheckBox getCheckPermissaoVendaSalva() {
        return checkPermissaoVendaSalva;
    }

    public JCheckBox getCheckPermissaoEstoqueHistoricoTodo() {
        return checkPermissaoEstoqueHistoricoTodo;
    }

    public JCheckBox getCheckPermissaoEstoqueSomente() {
        return checkPermissaoEstoqueSomente;
    }
    
    public JButton getBotaoSalvaPermissao() {
        return botaoSalvaPermissao;
    }

    public JLabel getLabelPermissaoMensagem() {
        return labelPermissaoMensagem;
    }
    
    
    public List<JCheckBox> allCheckBox() {
        List<JCheckBox> lista = new ArrayList<>();
        
        lista.add(checkPermissaoCategoriaRemove);
        lista.add(checkPermissaoCategoriaSalva);
        lista.add(checkPermissaoClienteRemove);
        lista.add(checkPermissaoUsuarioEncontrarSomenteDados);
        lista.add(checkPermissaoUsuarioEncontrarTodos);
        lista.add(checkPermissaoUsuarioSalvar);
        lista.add(checkPermissaoUsuarioRemover);
        lista.add(checkPermissaoEstoqueRemove);
        lista.add(checkPermissaoEstoqueSalva);
        lista.add(checkPermissaoProdutoRemove);
        lista.add(checkPermissaoProdutoSalva);
        lista.add(checkPermissaoSalva);
        lista.add(checkPermissaoVendaSalva);
        lista.add(checkPermissaoVendaAtualiza);
        lista.add(checkPermissaoVendaRemove);
        lista.add(checkPermissaoEstoqueHistoricoTodo);
        lista.add(checkPermissaoEstoqueSomente);
        
        return lista;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogUsuario = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelMensagem = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        textoUsuario = new javax.swing.JTextField();
        textoSenha = new javax.swing.JPasswordField();
        textoFoto = new javax.swing.JTextField();
        comboboxPerfil = new javax.swing.JComboBox<>();
        botaoFoto = new javax.swing.JButton();
        radioBotaoAtivo = new javax.swing.JRadioButton();
        radioBotaoDesativo = new javax.swing.JRadioButton();
        botaoSalvar = new javax.swing.JButton();
        dialogPermissao = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        labelUsuarioName = new javax.swing.JLabel();
        checkPermissaoUsuarioSalvar = new javax.swing.JCheckBox();
        checkPermissaoUsuarioEncontrarSomenteDados = new javax.swing.JCheckBox();
        checkPermissaoUsuarioEncontrarTodos = new javax.swing.JCheckBox();
        checkPermissaoUsuarioRemover = new javax.swing.JCheckBox();
        checkPermissaoEstoqueSalva = new javax.swing.JCheckBox();
        checkPermissaoEstoqueSomente = new javax.swing.JCheckBox();
        checkPermissaoEstoqueHistoricoTodo = new javax.swing.JCheckBox();
        checkPermissaoEstoqueRemove = new javax.swing.JCheckBox();
        checkPermissaoProdutoSalva = new javax.swing.JCheckBox();
        checkPermissaoCategoriaRemove = new javax.swing.JCheckBox();
        checkPermissaoVendaSalva = new javax.swing.JCheckBox();
        checkPermissaoVendaAtualiza = new javax.swing.JCheckBox();
        checkPermissaoCategoriaSalva = new javax.swing.JCheckBox();
        checkPermissaoProdutoRemove = new javax.swing.JCheckBox();
        checkPermissaoVendaRemove = new javax.swing.JCheckBox();
        checkPermissaoSalva = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        checkPermissaoClienteRemove = new javax.swing.JCheckBox();
        botaoSalvaPermissao = new javax.swing.JButton();
        labelPermissaoMensagem = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botaoAdicionar = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        botaoPermissao = new javax.swing.JButton();
        botaoImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new com.mycompany.sistemadefacturacao20211958.view.componentes.Tabela();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        labelTitulo.setBackground(new java.awt.Color(255, 0, 153));
        labelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Adicionar Usuário");
        labelTitulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        labelMensagem.setBackground(new java.awt.Color(255, 255, 255));
        labelMensagem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelMensagem.setForeground(new java.awt.Color(255, 0, 153));
        labelMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Nome:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Usuário:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Senha:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Perfil:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Estado:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Foto");

        textoNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeActionPerformed(evt);
            }
        });

        textoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        textoSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        textoFoto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textoFoto.setEnabled(false);
        textoFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFotoActionPerformed(evt);
            }
        });

        comboboxPerfil.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboboxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleciona", "Admin", "Padrão" }));

        botaoFoto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botaoFoto.setText("Seleciona");

        radioBotaoAtivo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioBotaoAtivo);
        radioBotaoAtivo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioBotaoAtivo.setSelected(true);
        radioBotaoAtivo.setText("Activo");

        radioBotaoDesativo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioBotaoDesativo);
        radioBotaoDesativo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioBotaoDesativo.setText("Inativo");
        radioBotaoDesativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotaoDesativoActionPerformed(evt);
            }
        });

        botaoSalvar.setBackground(new java.awt.Color(255, 0, 153));
        botaoSalvar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setText("Salvar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoNome)
                    .addComponent(textoUsuario)
                    .addComponent(textoSenha)
                    .addComponent(comboboxPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBotaoAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioBotaoDesativo, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboboxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radioBotaoAtivo))
                    .addComponent(radioBotaoDesativo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout dialogUsuarioLayout = new javax.swing.GroupLayout(dialogUsuario.getContentPane());
        dialogUsuario.getContentPane().setLayout(dialogUsuarioLayout);
        dialogUsuarioLayout.setHorizontalGroup(
            dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogUsuarioLayout.setVerticalGroup(
            dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        labelUsuarioName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelUsuarioName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuarioName.setText("Otilia Marques");
        labelUsuarioName.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        checkPermissaoUsuarioSalvar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoUsuarioSalvar.setText("Salvar");
        checkPermissaoUsuarioSalvar.setName("usuario:salvar"); // NOI18N
        checkPermissaoUsuarioSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPermissaoUsuarioSalvarActionPerformed(evt);
            }
        });

        checkPermissaoUsuarioEncontrarSomenteDados.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoUsuarioEncontrarSomenteDados.setText("Somente teus Dados");
        checkPermissaoUsuarioEncontrarSomenteDados.setName("usuario:somenteTeusDados"); // NOI18N
        checkPermissaoUsuarioEncontrarSomenteDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPermissaoUsuarioEncontrarSomenteDadosActionPerformed(evt);
            }
        });

        checkPermissaoUsuarioEncontrarTodos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoUsuarioEncontrarTodos.setText("Buscar Todos");
        checkPermissaoUsuarioEncontrarTodos.setName("usuario:encontrarTodos"); // NOI18N
        checkPermissaoUsuarioEncontrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPermissaoUsuarioEncontrarTodosActionPerformed(evt);
            }
        });

        checkPermissaoUsuarioRemover.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoUsuarioRemover.setText("Remover");
        checkPermissaoUsuarioRemover.setName("usuario:removerPeloId "); // NOI18N

        checkPermissaoEstoqueSalva.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoEstoqueSalva.setText("Salvar");
        checkPermissaoEstoqueSalva.setName("estoque:salvar"); // NOI18N

        checkPermissaoEstoqueSomente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoEstoqueSomente.setText("Somente o Seu");
        checkPermissaoEstoqueSomente.setName("estoqueHistorico:somenteSeu"); // NOI18N
        checkPermissaoEstoqueSomente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPermissaoEstoqueSomenteActionPerformed(evt);
            }
        });

        checkPermissaoEstoqueHistoricoTodo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoEstoqueHistoricoTodo.setText("Todo Histórico");
        checkPermissaoEstoqueHistoricoTodo.setName("estoqueHistorico:encontrarTodos"); // NOI18N

        checkPermissaoEstoqueRemove.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoEstoqueRemove.setText("Remover");
        checkPermissaoEstoqueRemove.setName("estoque:removerPeloId"); // NOI18N

        checkPermissaoProdutoSalva.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoProdutoSalva.setText("Salvar");
        checkPermissaoProdutoSalva.setName("produto:salvar"); // NOI18N

        checkPermissaoCategoriaRemove.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoCategoriaRemove.setText("Remover");
        checkPermissaoCategoriaRemove.setName("categoria:removerPeloId "); // NOI18N

        checkPermissaoVendaSalva.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoVendaSalva.setText("Salvar");
        checkPermissaoVendaSalva.setName("venda:salvar"); // NOI18N

        checkPermissaoVendaAtualiza.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoVendaAtualiza.setText("Actualizar");
        checkPermissaoVendaAtualiza.setName("venda:actualizar"); // NOI18N

        checkPermissaoCategoriaSalva.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoCategoriaSalva.setText("Salvar");
        checkPermissaoCategoriaSalva.setName("categoria:salvar"); // NOI18N

        checkPermissaoProdutoRemove.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoProdutoRemove.setText("Remover");
        checkPermissaoProdutoRemove.setName("produto:removerPeloId"); // NOI18N

        checkPermissaoVendaRemove.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoVendaRemove.setText("Remover");
        checkPermissaoVendaRemove.setName("venda:remover"); // NOI18N

        checkPermissaoSalva.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoSalva.setText("Salvar");
        checkPermissaoSalva.setName("permissao:salvar"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Usuário");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Estoque");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Permissão");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Venda");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Produto");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Categória");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Cliente");

        checkPermissaoClienteRemove.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPermissaoClienteRemove.setText("Remover");
        checkPermissaoClienteRemove.setName("cliente:remover"); // NOI18N

        botaoSalvaPermissao.setBackground(new java.awt.Color(255, 0, 153));
        botaoSalvaPermissao.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botaoSalvaPermissao.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvaPermissao.setText("Salvar");

        labelPermissaoMensagem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelPermissaoMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUsuarioName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator3)
            .addComponent(jSeparator2)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
            .addComponent(jSeparator6)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator8)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvaPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(172, 172, 172)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(checkPermissaoUsuarioRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkPermissaoUsuarioSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkPermissaoUsuarioEncontrarSomenteDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkPermissaoUsuarioEncontrarTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(197, 197, 197)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(checkPermissaoEstoqueRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkPermissaoEstoqueHistoricoTodo, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(checkPermissaoEstoqueSomente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkPermissaoEstoqueSalva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(checkPermissaoProdutoSalva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkPermissaoProdutoRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(191, 191, 191)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(checkPermissaoCategoriaRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addComponent(checkPermissaoCategoriaSalva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(186, 186, 186)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkPermissaoVendaSalva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkPermissaoVendaAtualiza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkPermissaoVendaRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(180, 180, 180)
                        .addComponent(checkPermissaoSalva, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(checkPermissaoClienteRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addComponent(labelPermissaoMensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(labelUsuarioName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(labelPermissaoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPermissaoUsuarioSalvar)
                    .addComponent(checkPermissaoEstoqueSalva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPermissaoUsuarioEncontrarSomenteDados)
                    .addComponent(checkPermissaoEstoqueSomente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPermissaoUsuarioEncontrarTodos)
                    .addComponent(checkPermissaoEstoqueHistoricoTodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPermissaoUsuarioRemover)
                    .addComponent(checkPermissaoEstoqueRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPermissaoProdutoSalva)
                    .addComponent(checkPermissaoCategoriaSalva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPermissaoCategoriaRemove)
                    .addComponent(checkPermissaoProdutoRemove))
                .addGap(8, 8, 8)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPermissaoVendaSalva)
                    .addComponent(checkPermissaoSalva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkPermissaoVendaAtualiza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkPermissaoVendaRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkPermissaoClienteRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvaPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dialogPermissaoLayout = new javax.swing.GroupLayout(dialogPermissao.getContentPane());
        dialogPermissao.getContentPane().setLayout(dialogPermissaoLayout);
        dialogPermissaoLayout.setHorizontalGroup(
            dialogPermissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogPermissaoLayout.setVerticalGroup(
            dialogPermissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText(" > Usuário");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        botaoAdicionar.setBackground(new java.awt.Color(255, 0, 153));
        botaoAdicionar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.setName("Adicionar"); // NOI18N
        jPanel1.add(botaoAdicionar);

        botaoAtualizar.setBackground(new java.awt.Color(255, 0, 153));
        botaoAtualizar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        botaoAtualizar.setText("Actualizar");
        botaoAtualizar.setName("Actualizar"); // NOI18N
        jPanel1.add(botaoAtualizar);

        botaoRemover.setBackground(new java.awt.Color(255, 0, 153));
        botaoRemover.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoRemover.setForeground(new java.awt.Color(255, 255, 255));
        botaoRemover.setText("Remover");
        botaoRemover.setName("Remover"); // NOI18N
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });
        jPanel1.add(botaoRemover);

        botaoPermissao.setBackground(new java.awt.Color(255, 0, 153));
        botaoPermissao.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoPermissao.setForeground(new java.awt.Color(255, 255, 255));
        botaoPermissao.setText("Permissoes");
        botaoPermissao.setName("Permissoes"); // NOI18N
        jPanel1.add(botaoPermissao);

        botaoImprimir.setBackground(new java.awt.Color(255, 0, 153));
        botaoImprimir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoImprimir.setForeground(new java.awt.Color(255, 255, 255));
        botaoImprimir.setText("Imprimir");
        botaoImprimir.setName("Imprimir"); // NOI18N
        jPanel1.add(botaoImprimir);

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void radioBotaoDesativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotaoDesativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBotaoDesativoActionPerformed

    private void textoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeActionPerformed

    private void textoFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoFotoActionPerformed

    private void checkPermissaoUsuarioSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPermissaoUsuarioSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPermissaoUsuarioSalvarActionPerformed

    private void checkPermissaoUsuarioEncontrarSomenteDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPermissaoUsuarioEncontrarSomenteDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPermissaoUsuarioEncontrarSomenteDadosActionPerformed

    private void checkPermissaoEstoqueSomenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPermissaoEstoqueSomenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPermissaoEstoqueSomenteActionPerformed

    private void checkPermissaoUsuarioEncontrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPermissaoUsuarioEncontrarTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPermissaoUsuarioEncontrarTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoFoto;
    private javax.swing.JButton botaoImprimir;
    private javax.swing.JButton botaoPermissao;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoSalvaPermissao;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkPermissaoCategoriaRemove;
    private javax.swing.JCheckBox checkPermissaoCategoriaSalva;
    private javax.swing.JCheckBox checkPermissaoClienteRemove;
    private javax.swing.JCheckBox checkPermissaoEstoqueHistoricoTodo;
    private javax.swing.JCheckBox checkPermissaoEstoqueRemove;
    private javax.swing.JCheckBox checkPermissaoEstoqueSalva;
    private javax.swing.JCheckBox checkPermissaoEstoqueSomente;
    private javax.swing.JCheckBox checkPermissaoProdutoRemove;
    private javax.swing.JCheckBox checkPermissaoProdutoSalva;
    private javax.swing.JCheckBox checkPermissaoSalva;
    private javax.swing.JCheckBox checkPermissaoUsuarioEncontrarSomenteDados;
    private javax.swing.JCheckBox checkPermissaoUsuarioEncontrarTodos;
    private javax.swing.JCheckBox checkPermissaoUsuarioRemover;
    private javax.swing.JCheckBox checkPermissaoUsuarioSalvar;
    private javax.swing.JCheckBox checkPermissaoVendaAtualiza;
    private javax.swing.JCheckBox checkPermissaoVendaRemove;
    private javax.swing.JCheckBox checkPermissaoVendaSalva;
    private javax.swing.JComboBox<String> comboboxPerfil;
    private javax.swing.JDialog dialogPermissao;
    private javax.swing.JDialog dialogUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel labelMensagem;
    private javax.swing.JLabel labelPermissaoMensagem;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuarioName;
    private javax.swing.JRadioButton radioBotaoAtivo;
    private javax.swing.JRadioButton radioBotaoDesativo;
    private com.mycompany.sistemadefacturacao20211958.view.componentes.Tabela tabelaUsuario;
    private javax.swing.JTextField textoFoto;
    private javax.swing.JTextField textoNome;
    private javax.swing.JPasswordField textoSenha;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}