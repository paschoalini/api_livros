package com.guilda_plataforma.api_livros.entities;

import java.util.Objects;

public class Livro {
    private String ISBN;
    private String titulo;
    private String Tema;
    private Boolean jaLeu;
    private Pessoa emprestadoPara;

    public Livro() {
    }

    public Livro(String ISBN, String titulo, String tema, Boolean jaLeu, Pessoa emprestadoPara) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        Tema = tema;
        this.jaLeu = jaLeu;
        this.emprestadoPara = emprestadoPara;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String tema) {
        Tema = tema;
    }

    public Boolean getJaLeu() {
        return jaLeu;
    }

    public void setJaLeu(Boolean jaLeu) {
        this.jaLeu = jaLeu;
    }

    public Pessoa getEmprestadoPara() {
        return emprestadoPara;
    }

    public void setEmprestadoPara(Pessoa emprestadoPara) {
        this.emprestadoPara = emprestadoPara;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return ISBN.equals(livro.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", Tema='" + Tema + '\'' +
                ", jaLeu=" + jaLeu +
                ", emprestadoPara=" + emprestadoPara +
                '}';
    }
}
