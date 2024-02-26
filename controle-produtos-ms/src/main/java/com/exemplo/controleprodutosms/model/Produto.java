package com.exemplo.controleprodutosms.model;

import java.time.LocalDate;


public class Produto {
    
    private Integer id; 
    private String nome; 
    private String observação;
    private LocalDate dataCadastro; 
    private double valor;
    private Integer quantidade; 
    private double desconto; 
    private double acrescimo;
   
    public Produto(Integer id, String nome, String observação, LocalDate dataCadastro, double valor, Integer quantidade,
            double desconto, double acréscimo) {
        this.id = id;
        this.nome = nome;
        this.observação = observação;
        this.dataCadastro = dataCadastro;
        this.valor = valor;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.acrescimo = acrescimo;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getObservação() {
        return observação;
    }
    public void setObservação(String observação) {
        this.observação = observação;
    }
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public double getAcréscimo() {
        return acrescimo;
    }
    public void setAcréscimo(double acrescimo) {
        this.acrescimo = acrescimo;
    } 
    
    //e um método que retorna o valor total calculado..
   public double calcularValorTotal(){
    
    return (valor * quantidade) + acrescimo - desconto;
     
   }

}
