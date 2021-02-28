package com.dabesil.system.dto;

import java.io.Serializable;

import com.dabesil.system.domain.FreightOrder;
import com.dabesil.system.domain.OrderStatus;
import com.dabesil.system.domain.PaymentStatus;

public class FreightOrderDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String remetente;
    private String destinatario;
    private String telefoneRem;
    private String telefoneDest;
    private String endereco;
    private String destino;
    private String origem;
    private Integer quantidade = 1;
    private Double peso = 1.0;
    private Double preco;
    private PaymentStatus paymentStatus;
    private OrderStatus status;

    public FreightOrderDTO(){
    }

    public FreightOrderDTO(FreightOrder order) {
        id = order.getId();
        remetente = order.getRemetente();
        destinatario = order.getDestinatario();
        telefoneRem = order.getTelefoneRem();
        telefoneDest = order.getTelefoneDest();
        endereco = order.getEndereco();
        origem = order.getOrigem();
        destino = order.getDestino();
        quantidade = order.getQuantidade();
        peso = order.getPeso();
        preco = order.getPreco();
        paymentStatus = order.getPaymentStatus();
        status = order.getStatus();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getTelefoneRem() {
        return telefoneRem;
    }

    public void setTelefoneRem(String telefoneRem) {
        this.telefoneRem = telefoneRem;
    }

    public String getTelefoneDest() {
        return telefoneDest;
    }

    public void setTelefoneDest(String telefoneDest) {
        this.telefoneDest = telefoneDest;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

}
