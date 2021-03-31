package com.guilda_plataforma.api_livros.repository;

import com.guilda_plataforma.api_livros.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, String> {

    List<Livro> findAllByTemaIgnoreCase(String tema);
}
