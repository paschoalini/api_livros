package com.guilda_plataforma.api_livros.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Livro {

    @Id
    private String ISBN;
    private String titulo;
    private String Tema;
    private Boolean jaLeu;

    @OneToOne
    private Pessoa emprestadoPara;

}
