package com.urusianx.ecommerce.models;

public class PedidoProduto {

    private int idProduto;
    private int idCliente;
    private double valor;
    private int quantidade;

    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCiente) {
        this.idCliente = idCiente;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
}
