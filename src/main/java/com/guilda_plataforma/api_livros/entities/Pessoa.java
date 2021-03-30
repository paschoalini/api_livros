package com.guilda_plataforma.api_livros.entities;

import java.util.Objects;

public class Pessoa {
    private Long id;
    private String nome;
    private Boolean negativado;

    public Pessoa() {
    }

    public Pessoa(Long id, String nome, Boolean negativado) {
        this.id = id;
        this.nome = nome;
        this.negativado = negativado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getNegativado() {
        return negativado;
    }

    public void setNegativado(Boolean negativado) {
        this.negativado = negativado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return id.equals(pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", negativado=" + negativado +
                '}';
    }
}
