package br.com.fiap.exercicios.listview.RM78792;

import java.io.Serializable;

public class Pizza implements Serializable {

    private String sabor;
    private String ingredients;
    private String descricao;
    private String alergia;
    private int img;
    private Double preco;
    private Double nota;

    public Pizza(String sabor, String ingredients, String descricao, String alergia, int img, Double preco, Double nota) {
        this.sabor = sabor;
        this.ingredients = ingredients;
        this.descricao = descricao;
        this.alergia = alergia;
        this.img = img;
        this.preco = preco;
        this.nota = nota;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}