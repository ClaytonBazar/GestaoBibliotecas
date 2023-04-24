package Livro;

import java.util.Date;


public class Livros {

    private int id;
    private String titulo;
    private String genero;
    private int anoPublicacao;
    private String autor;
    private double precoEmprestimo;
    private int quantEstoque;
    private Date dataEntrega;

    public Livros() {

    }

    public Livros(String titulo, String genero, int anoPublicacao, String autor, double precoEmprestimo, int quantEstoque) {
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

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

   

}
