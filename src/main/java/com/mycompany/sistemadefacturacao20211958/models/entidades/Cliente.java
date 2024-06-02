package com.mycompany.sistemadefacturacao20211958.models.entidades;

//@author Otilia Marques
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Cliente {
    private int id;
    private String nome;
    private String morada;
    private String telefone;

    /*
    public Cliente() {
    }

    public Cliente(int id, String nome, String morada, String telefone) {
        this.id = id;
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }*/
}