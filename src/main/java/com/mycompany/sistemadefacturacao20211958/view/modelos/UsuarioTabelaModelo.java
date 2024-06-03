package com.mycompany.sistemadefacturacao20211958.view.modelos;

import com.mycompany.sistemadefacturacao20211958.models.entidades.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class UsuarioTabelaModelo extends AbstractTableModel {
    
    private List<Usuario> usuarios;
    private final String [] colunas = {"ID", "Nome", "Sobrenome", "Estado", "Perfil"};
    
    public UsuarioTabelaModelo (List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public UsuarioTabelaModelo() {}

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0 -> { return usuario.getId(); }
            case 1 -> { return usuario.getNome(); }
            case 2 -> { return usuario.getUsuario(); }
            case 3 -> { return usuario.getEstado(); }
            case 4 -> { return usuario.getPerfil(); }
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
          return colunas[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }   
}