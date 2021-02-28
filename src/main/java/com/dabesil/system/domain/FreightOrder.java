package com.dabesil.system.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class FreightOrder implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
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

    public FreightOrder() {
    }

    public FreightOrder(String id, String remetente, String destinatario, String telefoneRem, String telefoneDest,
            String endereco, String destino, String origem, Integer quantidade,
            Double peso, Double preco, PaymentStatus paymentStatus, OrderStatus status) {
        this.id = id;
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.telefoneRem = telefoneRem;
        this.telefoneDest = telefoneDest;
        this.endereco = endereco;
        this.destino = destino;
        this.origem = origem;
        this.quantidade = quantidade;
        this.peso = peso;
        this.preco = preco;
        this.paymentStatus = paymentStatus;
        this.status = status;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FreightOrder other = (FreightOrder) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
