package br.ufpb.dcx.lojaroupas;

import java.util.Objects;

public class Roupa {
    private String modelo;
    private String cor;
    private double preco;
    private String tamanho;

    public Roupa (String modelo, String cor, double preco, String tamanho){
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.tamanho = tamanho;
    }
    public Roupa(){
        this("Sem modelo", "Sem cor", 0.0, "Sem tamanho");
    }
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor(){
        return this.cor;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString (){
        return "Nome: "+ this.modelo +", Cor:"+this.cor+", Tamanho "+ this.tamanho;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Roupa roupa = (Roupa) o;
        return Objects.equals(modelo, roupa.modelo) && Objects.equals(cor, roupa.cor) && Objects.equals(tamanho, roupa.tamanho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, cor, tamanho);
    }
}
