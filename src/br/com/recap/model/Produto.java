/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.recap.model;

/**
 *
 * @author User
 */
public class Produto {
    private String nome;
    private Double preco;
    private Boolean seVendido;
    
    public String getNome(){
        return nome;
    }
            
    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Boolean getSeVendido() {
        return seVendido;
    }

    public void setSeVendido(Boolean seVendido) {
        this.seVendido = seVendido;
    }
}
