package com.mycompany.sistemadefacturacao20211958.models.entidades;

//@author Otilia Marques

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor; 

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class Venda {
    private Long id;
    private Long idCliente;
    private Long idUsuario;
    private BigDecimal totalVenda;
    private BigDecimal totalPago;
    private BigDecimal desconto;
    private BigDecimal troco;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime ultimaActualizacao;

    /*
    public Venda() {
    }

    public Venda(long id, Cliente cliente, Usuario usuario, BigDecimal totalVenda, BigDecimal totalPago, BigDecimal desconto, BigDecimal troco, LocalDateTime dataHoraCriacao, LocalDateTime ultimaActualizacao) {
        this.id = id;
        this.cliente = cliente;
        this.usuario = usuario;
        this.totalVenda = totalVenda;
        this.totalPago = totalPago;
        this.desconto = desconto;
        this.troco = troco;
        this.dataHoraCriacao = dataHoraCriacao;
        this.ultimaActualizacao = ultimaActualizacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(BigDecimal totalVenda) {
        this.totalVenda = totalVenda;
    }

    public BigDecimal getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(BigDecimal totalPago) {
        this.totalPago = totalPago;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public LocalDateTime getUltimaActualizacao() {
        return ultimaActualizacao;
    }

    public void setUltimaActualizacao(LocalDateTime ultimaActualizacao) {
        this.ultimaActualizacao = ultimaActualizacao;
    }*/
}