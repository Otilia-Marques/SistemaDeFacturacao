/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefacturacao20211958.view.modelos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ClienteModelo extends AbstractTableModel {
    
    private List<Cliente> clientes;
    private final String [] colunas = {"ID", "Nome", "CPF", "Morada"};

    public ClienteModelo(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        
        switch(columnIndex) {
            case 0 -> { return cliente.getId() ;}
            case 1 -> { return cliente.getNome() ;}
            case 2 -> { return cliente.getCpf() ;}
            case 3 -> { return cliente.getMorada() ;}
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

    public List<Cliente> getClientes() {
        return clientes;
    }
    
}
