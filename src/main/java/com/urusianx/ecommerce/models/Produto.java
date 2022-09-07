package com.urusianx.ecommerce.models;

public class Produto {

    private String codigo;
    private String nome;
    private String descricao;
    private double valor;
    private int quantidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
        if (this.codigo == null || this.codigo.isEmpty()){
            this.codigo = this.nome.substring(0, 3).toUpperCase() + "-" + this.nome.length();
        }
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
}
