/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefacturacao20211958.view.modelos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class EstoqueModelo extends AbstractTableModel {
    
    private List<EstoqueDto> estoques;
    private static final String [] colunas = {"ID", "Produto", "Estado", "Quantidade", "Data"};

    public EstoqueModelo(List<EstoqueDto> estoques) {
        this.estoques = estoques;
    }

    @Override
    public int getRowCount() {
        return estoques.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EstoqueDto estoque = estoques.get(rowIndex);
        
        switch (columnIndex) {
            case 0 -> { return estoque.getId();}
            case 1 -> { return estoque.getProduto();}
            case 2 -> { return estoque.isEstado();}
            case 3 -> { return estoque.getQuantidade();}
            case 4 -> { return estoque.getDataCriacao();}
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

    public List<EstoqueDto> getEstoques() {
        return estoques;
    }
    
    
}
