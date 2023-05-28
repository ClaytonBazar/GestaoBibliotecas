/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livro;

import java.util.Date;

public class Livros {

    private int id;
    private String titulo;
    private String genero;
    private int anoPublicacao;
    private String autor;
    private double precoEmprestimo;
    private String quantEstoque;
 

    public Livros() {

    }

    public Livros(String titulo, String genero, int anoPublicacao, String autor, double precoEmprestimo, String quantEstoque) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.precoEmprestimo = precoEmprestimo;
        this.quantEstoque = quantEstoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecoEmprestimo() {
        return precoEmprestimo;
    }

    public void setPrecoEmprestimo(double precoEmprestimo) {
        this.precoEmprestimo = precoEmprestimo;
    }

    public String getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(String quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
